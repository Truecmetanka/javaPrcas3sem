package lab06.task03;

public class Cars implements Nameable{


    public Cars(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }
}
