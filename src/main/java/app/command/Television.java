package app.command;

public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Turned on");
    }

    @Override
    public void off() {
        System.out.println("Turned off");
    }

    @Override
    public void volumeUp() {
        ++volume;
        System.out.println("Volume: " + volume);
    }

    @Override
    public void volumeDown() {
        --volume;
        System.out.println("Volume: " + volume);
    }
}
