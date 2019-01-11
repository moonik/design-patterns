package app.composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup implements SongComp {

    private List<SongComp> songComponents = new ArrayList<>();
    private String name;
    private String groupDescription;

    public SongGroup(String name, String groupDescription) {
        this.name = name;
        this.groupDescription = groupDescription;
    }

    public void add(SongComp component) {
        this.songComponents.add(component);
    }

    public void remove(SongComp component) {
        this.songComponents.remove(component);
    }

    public SongComp get(int index) {
        return this.songComponents.get(index);
    }

    @Override
    public void displayInfo() {
        System.out.println("Group name: " + name + ". Group description: " + groupDescription);
        songComponents.forEach(SongComp::displayInfo);
    }
}
