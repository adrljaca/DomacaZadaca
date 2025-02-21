package SmartDevice;

public class SmartThermostat extends SmartDevice implements RemoteControllable {
    private int temperature;

    public SmartThermostat(String firmwareVersion, int temperature) {
        super(firmwareVersion);
        this.temperature = temperature;
    }

    @Override
    public void performAction() {
        System.out.println("Temperatura prostorije je podešena na " + temperature + "°C.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Trenutna temperatura u prostoriji iznosi " + temperature + "°C.");
    }

    @Override
    public void remoteControl(String command) {
        if (command.startsWith("temp")) {
            String[] parts = command.split(" ");
            if (parts.length == 2) {
                temperature = Integer.parseInt(parts[1]);
                System.out.println("Temperatura na pametnom termostatu je podešena na " + temperature + "°C.");
            }
        }
    }
}