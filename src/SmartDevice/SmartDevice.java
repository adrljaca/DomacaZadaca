package SmartDevice;

public abstract class SmartDevice {
    private String firmwareVersion;

    public SmartDevice(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public abstract void performAction();
    public abstract void displayStatus();

    public void updateFirmware (String version) {
        this.firmwareVersion = version;
        System.out.println("Uređaj ažuriran na verziju: " + version);
    }
}