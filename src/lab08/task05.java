package lab08;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        printDigits(scanner.nextInt());
    }

    private static void printDigits(int num) {
        var digit = num % 10;
        System.out.print(digit + " ");
        if (num / 10 == 0) return;
        printDigits(num / 10);
    }
}

    /* ������� ����� ����� ������ ������
        ���� ����������� ����� N. �������� ��� ��� ����� �� �����, � ��������
        �������, �������� �� ��������� ��� ������ ��������. */
