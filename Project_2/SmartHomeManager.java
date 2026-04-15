package project_2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class SmartHomeManager {
    private ArrayList<SmartDevice> deviceList;
    private HashMap<Integer, SmartDevice> deviceMap;

    public SmartHomeManager() {
        deviceList = new ArrayList<>();
        deviceMap = new HashMap<>();
    }

    public void addDevice(SmartDevice device) throws DuplicateDeviceException {
        if (deviceMap.containsKey(device.getDeviceId())) {
            throw new DuplicateDeviceException("Device ID already exists: " + device.getDeviceId());
        }
        deviceList.add(device);
        deviceMap.put(device.getDeviceId(), device);
        System.out.println("Device added successfully.");
    }

    public SmartDevice searchDevice(int id) throws DeviceNotFoundException {
        if (!deviceMap.containsKey(id)) {
            throw new DeviceNotFoundException("Device with ID " + id + " not found.");
        }
        return deviceMap.get(id);
    }

    public void removeDevice(int id) throws DeviceNotFoundException {
        SmartDevice device = searchDevice(id);
        deviceList.remove(device);
        deviceMap.remove(id);
        System.out.println("Device removed successfully.");
    }

    public void displayAllDevices() {
        if (deviceList.isEmpty()) {
            System.out.println("No devices available.");
            return;
        }

        for (SmartDevice device : deviceList) {
            device.displayInfo();
        }
    }

    public void totalPowerConsumption() {
        double total = 0;
        for (SmartDevice device : deviceList) {
            if (device.isOn()) {
                total += device.getPowerConsumption();
            }
        }
        System.out.println("Total power consumption of ON devices: " + total + " W");
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (SmartDevice device : deviceList) {
                writer.println(device.toFileString());
            }
            System.out.println("Devices saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            deviceList.clear();
            deviceMap.clear();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String type = parts[0];
                int id = Integer.parseInt(parts[1]);
                String name = parts[2];
                String room = parts[3];
                double power = Double.parseDouble(parts[4]);
                boolean status = Boolean.parseBoolean(parts[5]);

                SmartDevice device = null;

                switch (type) {
                    case "Light":
                        int brightness = Integer.parseInt(parts[6]);
                        device = new Light(id, name, room, power, brightness);
                        break;

                    case "Fan":
                        int speed = Integer.parseInt(parts[6]);
                        device = new Fan(id, name, room, power, speed);
                        break;

                    case "AC":
                        int temperature = Integer.parseInt(parts[6]);
                        device = new AC(id, name, room, power, temperature);
                        break;

                    case "DoorLock":
                        boolean locked = Boolean.parseBoolean(parts[6]);
                        device = new DoorLock(id, name, room, power, locked);
                        break;
                }

                if (device != null) {
                    device.setStatus(status);
                    deviceList.add(device);
                    deviceMap.put(id, device);
                }
            }

            System.out.println("Devices loaded from file successfully.");
        } catch (IOException e) {
            System.out.println("Error while loading file: " + e.getMessage());
        }
    }
}