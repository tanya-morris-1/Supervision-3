import java.util.AbstractList;
import java.util.List;

public class CollectionArrayList2<T> extends AbstractList {
    T[] list;
    int length;

    CollectionArrayList2(){
        list = (T[]) new Object[0];
        length = list.length;
    }

    @Override
    public boolean add(Object item) {
        list = (T[]) new Object[length+1];
        length += 1;
        list[length-1] = (T) item;
        return true;
    }

    @Override
    public Object set(int index, Object element) {
        list[index] = (T) element;
        return element;
    }

    @Override
    public T remove(int index) {
        T to_remove = list[index];
        for (int i = 0; i < length; i++) {
            if (i > index) {
                T current_element = list[i];
                list[index+i-1] = current_element;
            }
        }
        length -= 1;
        return to_remove;
    }
    @Override
    public T get(int index) {
        if (length < index) {
            return null;
        } else {
            return list[index];
        }
    }

    @Override
    public int size() {
        return length;
    }
}
