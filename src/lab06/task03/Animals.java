package lab06.task03;

public class Animals implements Nameable{


    public Animals(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }
}
