package project_2;

class AC extends SmartDevice {
    private int temperature;

    public AC(int deviceId, String deviceName, String room, double powerConsumption, int temperature) {
        super(deviceId, deviceName, room, powerConsumption);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void displayInfo() {
        System.out.println("AC [ID=" + getDeviceId() +
                ", Name=" + getDeviceName() +
                ", Room=" + getRoom() +
                ", Status=" + getStatus() +
                ", Power=" + getPowerConsumption() +
                ", Temperature=" + temperature + "°C]");
    }

    @Override
    public String toFileString() {
        return "AC," + getDeviceId() + "," + getDeviceName() + "," + getRoom() + "," +
                getPowerConsumption() + "," + isOn() + "," + temperature;
    }
}