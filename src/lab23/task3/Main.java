package lab23.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Expression exp = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.println("x^2 - 2x + 1 = " + exp.evaluate(x));
    }
}

//сделать арифметические функции (+, * и т.д) в таком виде
// new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5)

/* Для тестирования программы должен быть создан класс Main,
    который вычисляет значение выражения x
        2?2x+1, для x, заданного в
        командной строке.*/

/* Выделение общего интерфейса создаваемых классов.
   Выделение абстрактного базового класса для бинарных операций. */
