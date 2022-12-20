package lab06.task04;

public class Animals implements Priceable {

    private int price;

    public Animals(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
