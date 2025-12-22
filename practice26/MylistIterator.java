package practice26;

import java.util.Iterator;

public class MylistIterator<E> implements Iterator<E> {
    private int cursor;
    private int size;
    private Mylist<E> mylist;
    public MylistIterator(Mylist list){
        this.size= list.getSize();
        this.cursor=0;
        this.mylist=list;
    }
    @Override
    public boolean hasNext(){
        return cursor<size;
    }
    @Override
    public E next(){
        return (E)mylist.items[cursor++];
    }
}