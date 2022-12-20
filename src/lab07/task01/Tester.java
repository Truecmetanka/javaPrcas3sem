package lab07.task01;

public class Tester {
    public static void main(String[] args) {
        MovableRectangle r = new MovableRectangle(1, 0, 5,6, 3,3);
        r.moveDown();
        r.moveLeft();
        System.out.println(r.toString());
    }
}
