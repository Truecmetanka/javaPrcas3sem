package lab08;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        printDigits(scanner.nextInt());
    }

    private static void printDigits(int num) {
        var digit = num % 10;
        if (num / 10 == 0) {
            System.out.print(digit + " ");
            return;
        }
        printDigits(num / 10);
        System.out.print(digit + " ");
    }
}
    /*  Задание Цифры числа слева направо
        Дано натуральное число N. Выведите все его цифры по одной, в обычном
        порядке, разделяя их пробелами или новыми строками.  */
