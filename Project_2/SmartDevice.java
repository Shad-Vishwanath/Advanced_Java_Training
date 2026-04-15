package project_2;

abstract class SmartDevice implements Controllable {
    private int deviceId;
    private String deviceName;
    private String room;
    private boolean isOn;
    private double powerConsumption;

    public SmartDevice(int deviceId, String deviceName, String room, double powerConsumption) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.room = room;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getRoom() {
        return room;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    public void setStatus(boolean status) {
        this.isOn = status;
    }

    public abstract void displayInfo();
    public abstract String toFileString();
}