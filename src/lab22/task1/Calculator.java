package lab22.task1;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter RPN-expression: ");
        String rpn = in.nextLine();
        System.out.println("Result: " + calculate(rpn));
    }

    public static double calculate(String rpn) {
        Stack<Double> stack = new Stack<>();
        String[] str = rpn.split(" ");

        for (String s : str) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                double a = stack.pop();
                double b = stack.pop();
                double result = switch(s) {
                    case "-" -> b - a;
                    case "*" -> a * b;
                    case "/" -> b / a;
                    default -> a + b;
                };
                stack.push(result);
            } else {
                stack.push(Double.parseDouble(s));
            }
        }

        return stack.peek();
    }
}
// Алгоритм Обратной польской нотации (ОПН)

//  7 2 3 * - (эквивалентное выражение в инфиксной нотации: 7 ? 2 * 3).

//Первый по порядку знак операции — «*», поэтому первой выполняется операция умножения над операндами 2 и 3 (они стоят последними перед знаком). Выражение при этом преобразуется к виду 7 6 ? (результат умножения — 6, — заменяет тройку «2 3 *»).
//Второй знак операции — «?». Выполняется операция вычитания над операндами 7 и 6.
//Вычисление закончено. Результат последней операции равен 1, это и есть результат вычисления выражения.
