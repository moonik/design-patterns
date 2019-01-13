package app.composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup implements SongComponent {

    private List<SongComponent> songComponents = new ArrayList<>();
    private String name;
    private String groupDescription;

    public SongGroup(String name, String groupDescription) {
        this.name = name;
        this.groupDescription = groupDescription;
    }

    public void add(SongComponent component) {
        this.songComponents.add(component);
    }

    public void remove(SongComponent component) {
        this.songComponents.remove(component);
    }

    public SongComponent get(int index) {
        return this.songComponents.get(index);
    }

    @Override
    public void displayInfo() {
        System.out.println("Group name: " + name + ". Group description: " + groupDescription);
        songComponents.forEach(SongComponent::displayInfo);
    }
}
