package practice24;

public class Complex {
    private int real;
    private int image;
    public Complex(int real,int image){
        this.image=image;
        this.real=real;
    }

    @Override
    public String toString(){
        if(image>=0){
            return "Комплексное число "+real+"+i"+image;

        }
        else{
            return "Комплексное число "+real+"-i"+(image*(-1));
        }
    }
}