package Prac2.Prac2_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� �������: ");
        int n = scanner.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < n/2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
