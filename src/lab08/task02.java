package lab08;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        outOdds();
    }

    private static void outOdds() {
        var scanner = new Scanner(System.in);
        var num = scanner.nextInt();
        if (num == 0) return;
        if (num % 2 == 1) System.out.println(num);
        outOdds();
    }
}

/* Задание Вывести нечетные числа последовательности
        Дана последовательность натуральных чисел (одно число в строке),
        завершающаяся числом 0. Выведите все нечетные числа из этой
        последовательности, сохраняя их порядок. */
