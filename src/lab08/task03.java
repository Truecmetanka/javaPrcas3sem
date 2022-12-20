package lab08;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        outOddIndices();
    }

    private static void outOddIndices() {
        var scanner = new Scanner(System.in);
        var num1 = scanner.nextInt();
        if (num1 != 0) System.out.println(num1);
        var num2 = scanner.nextInt();
        if (num1 == 0 || num2 == 0) return;
        outOddIndices();
    }
}

   /* Задание Вывести члены последовательности с нечетными номерами
    Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся числом 0. Выведите первое, третье, пятое и т.д. из введенных
        чисел. Завершающий ноль выводить не надо. */