package lab14;
import java.util.regex.*;

public class task04 {
    public static void main(String[] args) {
        String s1 = "(1+8)Ц9/4";
        String s2 = "6/5Ц2*9";

        String regexp = "(\\d[^+])";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher1 = pattern.matcher(s1);
        Matcher matcher2 = pattern.matcher(s2);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}

/* ƒан текст, необходимо проверить есть ли в тексте цифры, за
    которыми не стоит знак Ђ+ї.
        a) пример правильных выражений:(1 + 8) Ц 9 / 4
        b) пример неправильных выражений: 6 / 5 Ц 2 * 9 */
