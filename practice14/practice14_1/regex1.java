package practice14.practice14_1;


public class regex1 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String test1 = "abcdefghijklmnopqrstuv18340";
        String test2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        System.out.println("Тест 1 (правильная): " + test1.matches(regex));
        System.out.println("Тест 2 (неправильная): " + test2.matches(regex));

        // Анализируем, где начинается несоответствие
        String pattern = "abcdefghijklmnopqrstuv18340";
        int mismatchIndex = findFirstMismatch(test2, pattern);

        if (mismatchIndex != -1) {
            System.out.println("\nАнализ неправильной строки:");
            System.out.println("Первое несоответствие на позиции " + mismatchIndex +
                    " (индекс " + (mismatchIndex - 1) + ")");
            System.out.println("Правильный фрагмент: \"" + pattern.substring(0, Math.min(mismatchIndex, pattern.length())) + "\"");
            System.out.println("Неправильный фрагмент: \"" + test2.substring(0, Math.min(mismatchIndex, test2.length())) + "...\"");


        }
    }

    private static int findFirstMismatch(String input, String pattern) {
        int minLength = Math.min(input.length(), pattern.length());
        for (int i = 0; i < minLength; i++) {
            if (input.charAt(i) != pattern.charAt(i)) {
                return i + 1; // Возвращаем позицию (начиная с 1)
            }
        }
        // Если все символы совпадают, но длины разные
        if (input.length() != pattern.length()) {
            return minLength + 1;
        }
        return -1; // Строки идентичны
    }
}