package practice23;

import java.util.Arrays;

public class ArrayQueue<E>  {
    int size=5;
    Object[] items=new Object[size];
    int front,rear;
    int k;
    public ArrayQueue(){
        this.front=-1;
        this.rear=-1;
        this.k=0;
    }
    //Пред условия k и size Пост условия true or false
    public boolean isFull(){
        return k==size;

    }
    //Пред условия k Пост условия true or false
    public boolean isEmpty(){
        return k==0;
    }
    //Пред условия element, size, k<size
    //Пост условия добавление элемента в конец очереди, rear обновляется, k++
    public void enqueue(E element) {
        if (isFull()){
            throw new IllegalArgumentException("Очередь заполнена");
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        items[rear]=element;
        k++;
    }
    //Пред условия: items, size Пост условия: удаление первого элемента и вывод его
    public E dequeue(){
        if(isEmpty()){
            throw new IllegalArgumentException("Очередь пуста");
        }
        E element=(E) items[front];
        items[front]=null;
        front=(front+1)%size;
        k--;
        return element;
    }
    //Пред условия: items front, Пост условия вывод первого элемента
    public  E elemnt(){
        if(isEmpty()){
            throw new IllegalArgumentException("Очередь пуста");
        }
        return (E)items[front];
    }
    // Пост условие возвращает занятость очереди
    public int size(){
        return k;
    }
    // Пост условие очищает очередь
    public void clear(){
        if(isEmpty()){
            throw new IllegalArgumentException("Очередь уже пуста");
        }
        k=0;
        Arrays.fill(items,null);
        front=-1;
        rear=-1;
    }
    //Пост условия возвращает очередь в строке
    @Override
    public String toString(){
        return Arrays.toString(items);
    }
    public static void main(String[] args){
        ArrayQueue<Integer> array=new ArrayQueue<>();
        System.out.println(array);
        for(int i=0;i<array.size;i++){
            array.enqueue(i+1);
        }
        System.out.println("\n");

        System.out.println("Исходная очередь " + array);
        System.out.println("Удалить и вернуть первый элемент в очереди " + array.dequeue());
        System.out.println("Первый элемент в очереди " + array.elemnt());
        System.out.println("Длина очереди " + (array.size()));
        System.out.println("Пустая ли очередь?  " + array.isEmpty());
        array.clear();
        System.out.println("Конечная очередь " + array);

    }
}


//Размер очереди k всегда удовлетворяет условию 0 ≤ k ≤ size
//Если очередь не пуста, items[front] - первый элемент очереди
//Если очередь не пуста, items[rear] - последний элемент очереди
//Элементы очереди хранятся непрерывно в массиве items в циклическом порядке
//front и rear всегда в диапазоне [0, size-1] или -1 при пустой очереди
//При k == 0: front = rear = -1
//При k > 0: rear = (front + k - 1) % size