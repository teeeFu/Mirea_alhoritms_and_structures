package practice22;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot POP from empty stack");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }
}
