package practice4;

public enum Seasons {
    WINTER("Я люблю зиму!", -11), SPRING("Я люблю весну!", 8.7), SUMMER("Я люблю лето!", 18), AUTUMN("Я люблю осень!", 7.7);

    private String my_react;
    private double temp;

    Seasons(String my_react, double temp) {
        this.my_react= my_react;
        this.temp = temp;
    }

    public String getMy_react(){
        return my_react;
    }
    public double getTemp(){
        return temp;
    }

    public String getDescription(Seasons season){
        if (this == SUMMER)
            return "Теплое время года";
        else
            return "Холодное время года";
    }

    public static void printSeasonsMess(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println(WINTER.my_react);
                break;
            case SPRING:
                System.out.println(SPRING.my_react);
                break;
            case SUMMER:
                System.out.println(SUMMER.my_react);
                break;
            case AUTUMN:
                System.out.println(AUTUMN.my_react);
                break;
        }
    }
}
