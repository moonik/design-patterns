package app.composite;

public class Application {

    public static void main(String[] args) {
        SongComp dubstep = new SongGroup("DubStep", "Description of Dubstep group");
        SongComp rock = new SongGroup("Rock", "Description of Rock Group");
        SongComp any = new SongGroup("any song group", "any description");
        SongComp industrial = new SongGroup("industrial", "industrial");

        ((SongGroup) any).add(industrial);
        ((SongGroup) industrial).add(new Song("industrial song", "industrial song description", "213131"));

        ((SongGroup) industrial).add(dubstep);
        ((SongGroup) dubstep).add(new Song("some dubstep song 1", "dumb name", "2012-12-12"));
        ((SongGroup) dubstep).add(new Song("dubstep song 2", "dumbest name ever", "122-222-22"));

        ((SongGroup) any).add(rock);
        ((SongGroup) rock).add(new SongGroup("Rock", "Rock song"));

        Radio radio = new Radio(any);
        radio.printInfo();
    }
}
