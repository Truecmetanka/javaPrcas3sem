package lab06.task04;

public class Tester {
    public static void main(String[] args) {
        Cars car = new Cars(10000000);
        System.out.println(car.getPrice());
        Animals animal = new Animals(50000);
        System.out.println(animal.getPrice());
    }
}
