package practice3;

public class practice3_6 {
    public static void main(String[] args) {
        Double num1 = Double.valueOf(3.14);
        System.out.println("D from d " + num1);

        Double num2 = Double.valueOf("2.552");
        System.out.println("D from str " + num2 );

        Double num3 = Double.valueOf(42);
        System.out.println("D from int " + num3 );



        double num4 = Double.parseDouble("123.883");
        System.out.println("d from str " + num4);

        String text = "33.0921";
        double num5 = Double.parseDouble(text);
        System.out.println("d from Str " + num5);

        String d = Double.toString(3.14);
        System.out.println("S from d " + d);




    }
}

