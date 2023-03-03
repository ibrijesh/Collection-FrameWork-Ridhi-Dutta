import java.util.Iterator;

public class OurGenericList<T> implements Iterable {
    private final T[] items;
    private int size;

    public OurGenericList() {
        this.size = 0;
        this.items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new OurGenericListIterator(this);
    }


    private class OurGenericListIterator<T> implements Iterator {

        private final OurGenericList<T> list;
        private int index = 0;

        private OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }


        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }

}
