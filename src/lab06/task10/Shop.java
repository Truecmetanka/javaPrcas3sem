package lab06.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements Input{

    private ArrayList<Computer> computers;

    public Shop( ArrayList<Computer> computers) {
        this.computers = computers;
    }
    @Override
    public Computer input() {
        System.out.println("Input computer (name, mem, cpu, monitor)");
        Scanner scanner = new Scanner(System.in);
        return new Computer(scanner.next(), scanner.next(), scanner.next(), scanner.next());
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void addPC(ArrayList<Computer> list, Computer computer) {
        list.add(computer);
    }
    public void delPC(ArrayList<Computer> list, Computer computer) {
        list.remove(computer);;
    }
}
