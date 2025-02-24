package SmartDevice;

public class SmartAirFilter extends SmartDevice implements RemoteControllable {
    private boolean isFilteringAir;

    public SmartAirFilter(String firmwareVersion, boolean isFilteringAir) {
        super(firmwareVersion);
        this.isFilteringAir = isFilteringAir;
    }

    @Override
    public void performAction() {
        if (isFilteringAir) {
            System.out.println("Pametni filter filtrira zrak u prostoriji.");
        } else {
            System.out.println("Pametni filter zraka je ugašen.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Status filtera zraka: " + (isFilteringAir ? "On" : "Off"));
    }

    @Override
    public void remoteControl(String command) {
        if (command.equalsIgnoreCase("Start")) {
            isFilteringAir = true;
            System.out.println("Uključeno filtriranje zraka.");
        } else if (command.equalsIgnoreCase("Stop")) {
            isFilteringAir = false;
            System.out.println("Isključeno filtriranje zraka.");
        }
    }
}