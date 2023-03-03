import java.util.Iterator;

public class OurGenericClass<T> implements Iterable{
    private T[] items;
    private int size;

    public OurGenericClass() {
        this.size = 0;
        this.items = (T[]) new Object[100];
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    private class Our

}
