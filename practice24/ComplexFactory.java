package practice24;

public class ComplexFactory implements ComplexAbstractFactory{
    private int real;
    private int image;
    public ComplexFactory(int real,int image){
        this.real=real;
        this.image=image;
    }
    public ComplexFactory(){
        this.real=0;
        this.image=0;
    }
    @Override
    public Complex CreateComplex(int real,int image){
        return new Complex(real,image);
    }
    @Override
    public Complex createComplex(){
        return new Complex(8,2);
    }
}