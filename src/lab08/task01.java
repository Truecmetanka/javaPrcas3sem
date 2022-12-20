package lab08;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.println("Количество единиц: " + countOnes());
    }

    private static int countOnes() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) return countOnes() + 1;
        else if (n == 0) {
            int n2 = in.nextInt();
            if (n2 == 0) {
                return 0;
            } else if (n2 == 1) return countOnes() + 1;
        }
        return countOnes();
    }
}

   /* Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
        последовательности встречается число 1. Числа, идущие после двух нулей,
        необходимо игнорировать */