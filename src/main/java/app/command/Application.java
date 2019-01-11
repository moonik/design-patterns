package app.command;

public class Application {

    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(device);
        DeviceButton onButton = new DeviceButton(onCommand);
        onButton.press();

        TurnTVOff offCommand = new TurnTVOff(device);
        DeviceButton offButton = new DeviceButton(offCommand);
        offButton.press();
    }
}
