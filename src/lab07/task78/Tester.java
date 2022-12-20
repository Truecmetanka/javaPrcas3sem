package lab07.task78;

public class Tester {
    public static void main(String[] args) {
        Shop s = new Shop("Books");
        s.fillShopWithBooks("Aibolit", "Aibolit", "Grokaem algoritmi");
        s.fillShopWithMagazines("Magazine1", "Magazine1", "Magazine1");

        for (Magazine m : s.getMagazines()) {
            m.print();
        }

        for (Book b : s.getBooks()) {
            if (b instanceof Book) {
                b.print();
            }
        }
    }
}
