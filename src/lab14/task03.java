package lab14;
import java.util.regex.*;

public class task03 {
    public static void main(String[] args) {
        String prices = "25.98 USD, 0.004 EU, 44 ERR, 1005 RUB";
        String regexp = "(\\d*\\.\\d*|\\d*)\s(USD|EU|RUB)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(prices);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}

  /*  Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
        a) пример правильных выражений: 25.98 USD.
        b) пример неправильных выражений: 44 ERR, 0.004 EU*/