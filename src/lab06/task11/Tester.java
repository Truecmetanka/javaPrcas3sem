package lab06.task11;

public class Tester {
    public static void main(String[] args) {
        Celsium celsium = new Celsium(-40);

        System.out.println(celsium.convert()[0] + " faringate");
        System.out.println(celsium.convert()[1] + " kalvin");
    }
}
