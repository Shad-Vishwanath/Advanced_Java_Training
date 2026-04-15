package project_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartHomeManager manager = new SmartHomeManager();

        while (true) {
            System.out.println("\n===== SMART HOME AUTOMATION SYSTEM =====");
            System.out.println("1. Add Device");
            System.out.println("2. View All Devices");
            System.out.println("3. Turn ON Device");
            System.out.println("4. Turn OFF Device");
            System.out.println("5. Remove Device");
            System.out.println("6. Search Device");
            System.out.println("7. Total Power Consumption");
            System.out.println("8. Save Devices to File");
            System.out.println("9. Load Devices from File");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Choose Device Type:");
                        System.out.println("1. Light");
                        System.out.println("2. Fan");
                        System.out.println("3. AC");
                        System.out.println("4. DoorLock");
                        int type = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Device ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Device Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Room: ");
                        String room = sc.nextLine();

                        System.out.print("Enter Power Consumption: ");
                        double power = sc.nextDouble();

                        SmartDevice device = null;

                        switch (type) {
                            case 1:
                                System.out.print("Enter Brightness: ");
                                int brightness = sc.nextInt();
                                device = new Light(id, name, room, power, brightness);
                                break;
                            case 2:
                                System.out.print("Enter Speed: ");
                                int speed = sc.nextInt();
                                device = new Fan(id, name, room, power, speed);
                                break;
                            case 3:
                                System.out.print("Enter Temperature: ");
                                int temp = sc.nextInt();
                                device = new AC(id, name, room, power, temp);
                                break;
                            case 4:
                                System.out.print("Is Locked? (true/false): ");
                                boolean locked = sc.nextBoolean();
                                device = new DoorLock(id, name, room, power, locked);
                                break;
                            default:
                                System.out.println("Invalid device type.");
                        }

                        if (device != null) {
                            manager.addDevice(device);
                        }
                        break;

                    case 2:
                        manager.displayAllDevices();
                        break;

                    case 3:
                        System.out.print("Enter Device ID: ");
                        int onId = sc.nextInt();
                        manager.searchDevice(onId).turnOn();
                        System.out.println("Device turned ON.");
                        break;

                    case 4:
                        System.out.print("Enter Device ID: ");
                        int offId = sc.nextInt();
                        manager.searchDevice(offId).turnOff();
                        System.out.println("Device turned OFF.");
                        break;

                    case 5:
                        System.out.print("Enter Device ID to remove: ");
                        int removeId = sc.nextInt();
                        manager.removeDevice(removeId);
                        break;

                    case 6:
                        System.out.print("Enter Device ID to search: ");
                        int searchId = sc.nextInt();
                        SmartDevice found = manager.searchDevice(searchId);
                        found.displayInfo();
                        break;

                    case 7:
                        manager.totalPowerConsumption();
                        break;

                    case 8:
                        manager.saveToFile("devices.txt");
                        break;

                    case 9:
                        manager.loadFromFile("devices.txt");
                        break;

                    case 10:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (DuplicateDeviceException | DeviceNotFoundException e) {
                System.out.println("Custom Exception: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }
    }
}
