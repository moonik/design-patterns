package app.command;

public class TVVolumeUp implements Command {

    private ElectronicDevice device;

    public TVVolumeUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
