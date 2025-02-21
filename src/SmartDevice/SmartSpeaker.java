package SmartDevice;

public class SmartSpeaker extends SmartDevice implements RemoteControllable {
    private  int volume;
    private boolean isPlayingMusic;

    public SmartSpeaker(String firmwareVersion, int volume, boolean isPlayingMusic) {
        super(firmwareVersion);
        this.volume = volume;
        this.isPlayingMusic = isPlayingMusic;
    }

    @Override
    public void performAction() {
        if (isPlayingMusic) {
            System.out.println("Pametni zvučnik emitira glazbu sa glasnoćom od: " + volume + "%.");
        } else {
            System.out.println("Pametni zvučnik ne emitira glazbu.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Status zvučnika: " + (isPlayingMusic ? "On" : "Off") + " \tGlasnoća: " + volume + "%");
    }

    @Override
    public void remoteControl(String command) {
        if (command.equalsIgnoreCase("Play")) {
            isPlayingMusic = true;
            System.out.println("Pametni zvučnik je počeo emitirati glazbu.");
        } else if (command.equalsIgnoreCase("Stop")) {
            isPlayingMusic = false;
            System.out.println("Pametni zvučnik je prestao emitirati glazbu.");
        } else if (command.startsWith("volume")) {
            String[] parts = command.split(" ");
            if (parts.length == 2) {
                volume = Integer.parseInt(parts[1]);
                System.out.println("Glasnoća zvučnika podešena na: " + volume + "%");
            }
        }
    }
}