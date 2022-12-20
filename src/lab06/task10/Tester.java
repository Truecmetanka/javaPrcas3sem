package lab06.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void print(ArrayList<Computer> list) {
        for (Computer comp : list) {
            System.out.print(comp.toString());
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Computer> list = new ArrayList<>();
        Shop shop = new Shop(list);

        System.out.print("input number of computers: ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            //System.out.print("input name of computer: ");
            list.add(shop.input());
        }

        print(list);

        System.out.print("Введите имя компьютера, который вы ходите удалить: ");
        String nameCompForDel = scanner.next();
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(nameCompForDel)) {
                shop.delPC(list, list.get(i));
                System.out.println("Удаление выполенено");
                flag = false;
                print(list);
                break;
            }
        }
        if (flag) {
            System.out.println("Не найден элемент с заданным именем");
        }
        flag = true;
        System.out.print("Введите имя компьютера, который вы ходите найти: ");
        String nameCompForFind = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(nameCompForFind)) {
                System.out.println("Компьютер найден (его позиция в масииве - " + i + ")");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Компьютер не найден( ");
        }


    }


}
