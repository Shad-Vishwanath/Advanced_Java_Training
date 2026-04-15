package project_2;

class Fan extends SmartDevice {
    private int speed;

    public Fan(int deviceId, String deviceName, String room, double powerConsumption, int speed) {
        super(deviceId, deviceName, room, powerConsumption);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fan [ID=" + getDeviceId() +
                ", Name=" + getDeviceName() +
                ", Room=" + getRoom() +
                ", Status=" + getStatus() +
                ", Power=" + getPowerConsumption() +
                ", Speed=" + speed + "]");
    }

    @Override
    public String toFileString() {
        return "Fan," + getDeviceId() + "," + getDeviceName() + "," + getRoom() + "," +
                getPowerConsumption() + "," + isOn() + "," + speed;
    }
}