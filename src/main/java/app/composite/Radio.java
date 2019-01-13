package app.composite;

public class Radio {

    private SongComponent songs;

    public Radio(SongComponent songs) {
        this.songs = songs;
    }

    public void printInfo() {
        songs.displayInfo();
    }
}
