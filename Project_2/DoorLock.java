package project_2;

class DoorLock extends SmartDevice {
    private boolean locked;

    public DoorLock(int deviceId, String deviceName, String room, double powerConsumption, boolean locked) {
        super(deviceId, deviceName, room, powerConsumption);
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("DoorLock [ID=" + getDeviceId() +
                ", Name=" + getDeviceName() +
                ", Room=" + getRoom() +
                ", Status=" + getStatus() +
                ", Power=" + getPowerConsumption() +
                ", Locked=" + locked + "]");
    }

    @Override
    public String toFileString() {
        return "DoorLock," + getDeviceId() + "," + getDeviceName() + "," + getRoom() + "," +
                getPowerConsumption() + "," + isOn() + "," + locked;
    }
}
