package app.iterator;

import java.util.Iterator;

public class TigerCollection {

    private Animal[] tigers;

    public TigerCollection() {
        tigers = new Animal[2];
        tigers[0] = new Animal("Ti", "Tiger");
        tigers[1] = new Animal("Balu", "Tiger");
    }

    public Iterator getIterator() {
        return new TigerIterator();
    }

    private class TigerIterator implements Iterator {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < tigers.length;
        }

        @Override
        public Animal next() {
            return tigers[i++];
        }
    }
}
