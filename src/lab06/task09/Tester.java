package lab06.task09;

public class Tester {
    public static void main(String[] args) {
        Shop s = new Shop("Flowers");
        s.fillShop("Aibolit", "PlayBoy", "Grokaem algoritmi");
        for (Book b : s.getBooks()) {
            b.print();
        }
    }
}
