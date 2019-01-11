package app.command;

public class DeviceButton {

    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        this.command.execute();
    }

    public void pressUndo() {
        this.command.undo();
    }
}
