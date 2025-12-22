package practice26;

import java.util.Iterator;
import java.util.List;

public class Mylist<E> implements Iterable<E>{
    private int size=10;
    private int currentSize;
    public Object[] items=new Object[size];
    public Mylist(){
        this.currentSize=0;
    }
    public Iterator<E> iterator(){
        return new MylistIterator(this);
    }
    public void add(E element){
        if(currentSize==size){
            Object[] newItems=new Object[size*2];
            items=newItems;
        }
        items[currentSize]=element;
    }
    public void remove(int index){
        if(currentSize==0){
            throw new IllegalArgumentException("Список пуст");
        }
        items[currentSize]=null;
        currentSize--;
    }
    public int getSize(){
        return currentSize;
    }
    public static void main(String[] args){
        Mylist<Integer> my=new Mylist<>();
        for(int i=0;i<11;i++){
            my.add(12);
        }
        Iterator my1 = new MylistIterator(my);

    }
}