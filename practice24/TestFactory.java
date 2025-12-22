package practice24;

public class TestFactory {
    public static void main(String[] args){
        Complex number=ConcreteFactory.createComplex(new ComplexFactory());
        System.out.println(number);

    }
}