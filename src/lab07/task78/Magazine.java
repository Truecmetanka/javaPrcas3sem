package lab07.task78;

public class Magazine implements Printable {

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
