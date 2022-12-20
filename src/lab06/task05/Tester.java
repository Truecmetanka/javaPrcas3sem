package lab06.task05;


public class Tester {
    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(1, 2, 3, 5, 10);
        //c1.moveDown();
        c1.moveLeft();
        //c1.moveRight();
        c1.moveUp();
        System.out.println(c1.toString());
    }
}
