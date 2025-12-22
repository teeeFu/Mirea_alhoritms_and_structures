package practice23;

import java.util.Arrays;

public class ArrayQueueModule<E> {
    private static int size=5;
    private static Object[] items=new Object[size];
    private static int front,rear;
    private static int k;
    public ArrayQueueModule(){
        k=0;
        front=-1;
        rear=-1;
    }
    ///Пред условия элемент, k, size, rear, items
    /// Пост условия сдвинут rear, добавлен новый элемент k увеличен
    public void enqueue(E element){
        if(k==size){
            throw new IllegalArgumentException("Очередь полна");
        }
        rear=(rear+1)%size;
        items[rear]=element;
        k++;
    }
    /// Пред условие k front items
    /// Пост условия front сдвинут, уменьшен k, возврашен первый элемент и удален
    public E dequeue(){
        if(k==0){
            throw new IllegalArgumentException("Очередь пуста");
        }
        front=(front+1)%size;
        E element=(E)items[front];
        items[front]=null;

        k--;
        return element;
    }
    /// Пред условия k
    /// Пост условия выводим k
    public int size(){
        return k;
    }
    /// Пред условия items front
    /// пост условия возвращает первый элемент
    public E element(){
        return (E)items[front];
    }
    /// Пред условие k
    /// Пост условие true или false
    public boolean isEmpty(){
        return k==0;
    }
    /// Пред условие все поля
    /// Пост условие очищена очередь
    public void clear(){
        k=0;
        front=-1;
        rear=-1;
        Arrays.fill(items,null);
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }
    public static void main(String[] args){
        ArrayQueueModule<Integer> q=new ArrayQueueModule<>();
        ArrayQueueModule<Integer>que=new ArrayQueueModule<>();
        q.enqueue(12);
        q.enqueue(19);
        q.enqueue(13);
        System.out.println(q);
        System.out.println(que.dequeue());
        System.out.println(q.element());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.clear();
        System.out.println(q);
    }
}