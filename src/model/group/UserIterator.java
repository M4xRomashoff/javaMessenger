package model.group;

import java.util.Iterator;
import java.util.List;

public class UserIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index;

    public UserIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() { return index < list.size(); }

    @Override
    public T next() { return list.get(index++); }
}
