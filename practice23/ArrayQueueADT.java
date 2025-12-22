package practice23;

import java.util.Arrays;
import java.util.Queue;

public class ArrayQueueADT<E> {

    static class QueueMy<E>{
        int size=5;
        Object[] items=new Object[size];
        int front,rear;
        int k;
        QueueMy(){
            this.front=-1;
            this.rear=-1;
            this.k=0;
        }
    }
    //Пред условия нет Пост условие возвращает новую очередь
    public static<E> QueueMy<E> create(){
        return new QueueMy<>();
    }
    //Пред условия очерередь элемент очереди, размер текущей очереди, размер всей очереди, rear
    //Пост условия добавлен новый элемент в очередь rear сдвинут увеличен текущий размер очереди
    public static<E> void enqueue(QueueMy<E> queue,E element) {
        if(queue.k==queue.size){
            throw new IllegalArgumentException("Очередь полна");
        }
        queue.rear = (queue.rear + 1) % queue.size;
        queue.items[queue.rear] = element;

        queue.k++;
    }
    //Пред условия очередь, размер текущей очереди, front
    //Пост условия сдвинут front удален элемент и выведен уменьшен k
    public static<E>E dequeue(QueueMy<E> queue){
        if(queue.k==0){
            throw new IllegalArgumentException("Очередь пуста");
        }
        queue.front = (queue.front + 1) % queue.size;
        E element=(E)queue.items[queue.front];
        queue.items[queue.front]=null;
        queue.k--;
        return element;
    }
    ///Пред условия очередь
    /// Пост условия возвращен первый элемент очереди
    public static<E>E element(QueueMy<E> queue){
        return (E)queue.items[queue.front];
    }
    /// Пред условия очередь
    /// Пост условия возвращен размер очереди
    public static<E>int size(QueueMy<E> queue){
        return queue.k;
    }
    /// Пред условия очередь
    /// Пост условия возвращен true false
    public static<E>boolean isEmpty(QueueMy<E> queue){
        return queue.k==0;
    }
    /// Пред условия k,очередь,front,rear
    /// пост условия k=0, front=0, rear=0, очередь очищен
    public static<E>void clear(QueueMy<E> queue){
        queue.k=0;
        Arrays.fill(queue.items,null);
        queue.front=-1;
        queue.rear=-1;
    }
    /// Пред условия очередь
    /// Пост условия вернута строка очереди
    public static<E>String toString(QueueMy<E> queue){
        return Arrays.toString(queue.items);
    }
    public static void main(String[] args){
        QueueMy<Integer> qu=ArrayQueueADT.create();
        ArrayQueueADT.enqueue(qu,19);
        ArrayQueueADT.dequeue(qu);
        System.out.println(ArrayQueueADT.toString(qu));
        ArrayQueueADT.enqueue(qu,21);
        ArrayQueueADT.enqueue(qu,56);
        System.out.println(ArrayQueueADT.element(qu));
        System.out.println(ArrayQueueADT.size(qu));
        System.out.println(ArrayQueueADT.isEmpty(qu));
        ArrayQueueADT.clear(qu);
        System.out.println(ArrayQueueADT.toString(qu));

    }
}