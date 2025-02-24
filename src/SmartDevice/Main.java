package SmartDevice;

public class Main {
    public static void main(String[] args) {

        //Lampa
        SmartLight lampa = new SmartLight("1.0",false,50);
        System.out.println("\n-------------Lampa-------------");
        lampa.performAction();
        lampa.displayStatus();
        lampa.remoteControl("On");
        lampa.remoteControl("light 75");
        lampa.remoteControl("Off");
        lampa.remoteControl("On");
        lampa.performAction();
        lampa.displayStatus();
        lampa.updateFirmware("1.3");

        //Termos
        SmartThermostat termos = new SmartThermostat("1.0",18);
        System.out.println("\n-------------Termostat-------------");
        termos.performAction();
        termos.displayStatus();
        termos.remoteControl("temp 25");
        termos.performAction();
        termos.displayStatus();
        termos.updateFirmware("1.1");

        //Zvucnik
        SmartSpeaker zvucnik = new SmartSpeaker("1.0",50,false);
        System.out.println("\n-------------Zvučnik-------------");
        zvucnik.performAction();
        zvucnik.displayStatus();
        zvucnik.remoteControl("Play");
        zvucnik.remoteControl("volume 85");
        zvucnik.performAction();
        zvucnik.displayStatus();
        zvucnik.remoteControl("Stop");
        zvucnik.performAction();
        zvucnik.displayStatus();
        zvucnik.updateFirmware("2.0");

        //Filter
        SmartAirFilter filter = new SmartAirFilter("1.0", false);
        System.out.println("\n-------------Filter-------------");
        filter.performAction();
        filter.displayStatus();
        filter.remoteControl("Start");
        filter.performAction();
        filter.displayStatus();
        filter.remoteControl("Stop");
    }
}