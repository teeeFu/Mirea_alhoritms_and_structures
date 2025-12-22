package practice26;

import java.util.Arrays;
import java.util.Stack;

public class Invertor {
    public static<E> void invert(E [] obj){
        Stack<E> stack=new Stack<>();
        for(int i= 0;i< obj.length;i++){
            stack.push(obj[i]);
        }
        for(int i= 0;i< obj.length;i++){
            obj[i]=stack.pop();
        }
    }
    public static void main(String[] args){
        Double[] doubles=new Double[]{2.0,3.0,1.0,5.0,4.0};
        System.out.println("Исходный массив: " + Arrays.toString(doubles));
        Invertor.invert(doubles);
        System.out.println("Инвертированный массив: " + Arrays.toString( doubles));

    }

}