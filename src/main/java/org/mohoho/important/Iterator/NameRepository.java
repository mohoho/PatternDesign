package org.mohoho.important.Iterator;

/**
 * @author qmruan
 * @date 2023/6/12 17:45
 */
public class NameRepository implements Container {
    private String[] name = {"aaaa","bbbb","cccc"};

    private class NameIterator implements Iterable{

        int index;

        @Override
        public boolean hasNext() {
            if (index < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return name[index++];
        }
    }

    @Override
    public Iterable getIterator() {
        return new NameIterator();
    }
}
