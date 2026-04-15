package project_2;

class Light extends SmartDevice {
    private int brightness;

    public Light(int deviceId, String deviceName, String room, double powerConsumption, int brightness) {
        super(deviceId, deviceName, room, powerConsumption);
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void displayInfo() {
        System.out.println("Light [ID=" + getDeviceId() +
                ", Name=" + getDeviceName() +
                ", Room=" + getRoom() +
                ", Status=" + getStatus() +
                ", Power=" + getPowerConsumption() +
                ", Brightness=" + brightness + "]");
    }

    @Override
    public String toFileString() {
        return "Light," + getDeviceId() + "," + getDeviceName() + "," + getRoom() + "," +
                getPowerConsumption() + "," + isOn() + "," + brightness;
    }
}
