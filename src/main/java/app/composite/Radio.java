package app.composite;

public class Radio {

    private SongComp songs;

    public Radio(SongComp songs) {
        this.songs = songs;
    }

    public void printInfo() {
        songs.displayInfo();
    }
}
