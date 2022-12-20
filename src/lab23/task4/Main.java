package lab23.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x, y, z: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.print("Enter expression: ");
        in.nextLine();
        String expression = in.nextLine();
        Expression exp = ExpressionParser.parse(expression);

        System.out.println("Expression: " + exp);
        System.out.println("Result = " + exp.evaluate(x, y, z));
        System.out.println("========");
        System.out.println();

        exp = ExpressionParser.parse("1000000 * x * x * x * x * x / (x - 1)");

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.printf("x = %s, f = %s\n", i, exp.evaluate(i));
            } catch (ArithmeticException e) {
                System.out.printf("x = %s, %s\n", i, e.getMessage());
            }
        }
    }
}

// x * (y - 2)*z + 1 Для теста
// Доработайте предыдущее задание, так что бы выражение строилось по записи вида x * (y - 2)*z + 1

/* Для выражения 1000000*x*x*x*x*x/(x-1) вывод программы должен
        иметь следующий вид:
        x f
        0 0
        1 division by zero
        2 32000000
        3 121500000
        4 341333333
        5 overflow
        6 overflow
        7 overflow
        8 overflow
        9 overflow
        10 overflow
*/
