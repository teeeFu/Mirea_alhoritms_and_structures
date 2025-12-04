package practice4;

public class Seasons_problem {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;
        System.out.println("=== Мое любимое время года ===");
        System.out.println("Название: " + favoriteSeason);
        System.out.println("Реакция: " + favoriteSeason.getMy_react());
        System.out.println("Средняя температура: " + favoriteSeason.getTemp() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription(favoriteSeason));
        System.out.println();

        System.out.println("=== Все времена года ===");
        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getTemp() + "°C");
            System.out.println("Описание: " + season.getDescription(season));
            System.out.println("Реакция: " + season.getMy_react());
            System.out.println("---");



    }



    }

}
