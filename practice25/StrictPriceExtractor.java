package practice25;

import java.util.regex.*;

public class StrictPriceExtractor {
    public static void main(String[] args) {
        String text = """
                Правильные выражения: 25.98 USD, 100.00 RUB, 50 EUR, 75.30 EUR.
                Неправильные выражения: 44 ERR, 0.004 EU, 1000. RUS, .50 USD, 50.0.0 USD.
                """;

        //  только 1-2 знака после точки для USD/EUR, целые числа или с 1-2 знаками для RUB
        Pattern pattern = Pattern.compile(
                "\\b(\\d+(?:\\.\\d{1,2})?)\\s+(USD|EUR)\\b|\\b(\\d+(?:\\.\\d{1,2})?)\\s+RUB\\b"
        );

        Matcher matcher = pattern.matcher(text);

        System.out.println("Извлеченные цены:");
        while (matcher.find()) {
            String amountStr;
            String currency;

            if (matcher.group(1) != null) {
                // USD или EUR
                amountStr = matcher.group(1);
                currency = matcher.group(2);
            } else {
                // RUB
                amountStr = matcher.group(3);
                currency = "RUB";
            }

            double amount = Double.parseDouble(amountStr);
            System.out.printf("%s %s%n", amountStr, currency);
        }
    }
}

//"\\b(\\d+(?:\\.\\d{1,2})?)\\s+(USD|EUR)\\b|\\b(\\d+(?:\\.\\d{1,2})?)\\s+RUB\\b"

//\b — граница слова (не цифра/буква)
//(\d+(?:\.\d{1,2})?) — Группа 1: сумма
//
//\d+ — одна или больше цифр (целая часть)
//(?:\.\d{1,2})? — необязательная десятичная часть
//
//\. — точка
//\d{1,2} — ровно 1 или 2 цифры
//? — делает (?:\.\d{1,2}) необязательным
//(?: ... ) — незахватывающая группа (не создает группу для matcher.group())
//\s+ — один или больше пробельных символов
//(USD|EUR) — Группа 2: валюта (USD или EUR)
//\b — граница слова
//Часть 2 (после |): \b(\d+(?:\.\d{1,2})?)\s+RUB\b
//
//\b — граница слова
//(\d+(?:\.\d{1,2})?) — Группа 3: сумма (такая же как в части 1)
//\s+ — пробелы
//RUB — валюта RUB (без альтернатив)
//\b — граница слова