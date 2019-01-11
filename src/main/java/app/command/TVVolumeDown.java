package app.command;

public class TVVolumeDown implements Command {

    private ElectronicDevice device;

    public TVVolumeDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}