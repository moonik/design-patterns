package app.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LionCollection {

    private List<Animal> lions;

    public LionCollection() {
        this.lions =new ArrayList<>(Arrays.asList(new Animal("Alex", "Lion"), new Animal("Jack", "Lion")));
    }

    public Iterator getIterator() {
        return new LionIterator();
    }

    private class LionIterator implements Iterator {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < lions.size();
        }

        @Override
        public Animal next() {
            return lions.get(i++);
        }
    }
}
