package SmartDevice;

public class SmartLight extends SmartDevice implements RemoteControllable {
    private boolean isOn;
    private  int brightness;

    public SmartLight(String firmwareVersion, boolean isOn, int brightness) {
        super(firmwareVersion);
        this.isOn = isOn;
        this.brightness = brightness;
    }

    @Override
    public void performAction() {
        if (isOn) {
            System.out.println("Pametna lampa je upaljena.");
        } else {
            System.out.println("Pametna lampa je ugašena.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Status lampe: " + (isOn ? "On" : "Off") + " \tJačina svjetlosti: " + brightness + "%");
    }

    @Override
    public void remoteControl(String command) {
        if (command.equalsIgnoreCase("On")) {
            isOn = true;
            System.out.println("Pametna lampa se upalila.");
        } else if (command.equalsIgnoreCase("Off")) {
            isOn = false;
            System.out.println("Pametna lampa se ugasila.");
        } else if (command.startsWith("light")) {
            String[] parts = command.split(" ");
            if (parts.length == 2) {
                brightness = Integer.parseInt(parts[1]);
                System.out.println("Jačina svjetlosti je podešena na " + brightness + "%.");
            }
        }
    }
}