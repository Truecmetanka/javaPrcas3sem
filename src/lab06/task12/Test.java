package lab06.task12;

public class Test {
    public static void main(String... args)
    {
        StringBuilder2 str = new StringBuilder2("Hello");
        System.out.println(str.toString());
        str.append("WWW");
        System.out.println(str.toString());
        str.undo();
        System.out.println(str.toString());
    }
}
