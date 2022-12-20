package lab06.task04;

public class Cars implements Priceable {

    private int price;

    public Cars(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
