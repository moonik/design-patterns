package app.command;

public class TurnTVOn implements Command {

    //TurnTVOn works on all electronic devices
    private ElectronicDevice device;

    public TurnTVOn(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
