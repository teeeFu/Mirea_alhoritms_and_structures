package practice24;

public class ConcreteFactory {
    public static Complex createComplex(ComplexAbstractFactory factory){
        return factory.createComplex();
    }
}