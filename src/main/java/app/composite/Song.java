package app.composite;

public class Song implements SongComponent {

    private String name;
    private String bandName;
    private String release;

    public Song(String name, String bandName, String release) {
        this.name = name;
        this.bandName = bandName;
        this.release = release;
    }

    @Override
    public void displayInfo() {
        System.out.println("Song name: " + name + " : " + "band name " + bandName + " release: " + release);
    }
}
