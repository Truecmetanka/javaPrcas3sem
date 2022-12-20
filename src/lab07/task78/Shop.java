package lab07.task78;

public class Shop {

    private String name;
    private Book[] booksShelf = new Book[3];
    private Magazine[] magazineShelf = new Magazine[3];

    public Shop(String name) {
        this.name = name;
    }

    public void fillShopWithBooks(String name1, String name2, String name3) {
        this.booksShelf[0] = new Book(name1);
        this.booksShelf[1] = new Book(name2);
        this.booksShelf[2] = new Book(name3);
    }
    public void fillShopWithMagazines(String name1, String name2, String name3) {
        this.magazineShelf[0] = new Magazine(name1);
        this.magazineShelf[1] = new Magazine(name2);
        this.magazineShelf[2] = new Magazine(name3);
    }

    public Magazine[] getMagazines() {
        return magazineShelf;
    }

    public Book[] getBooks() {
        return booksShelf;
    }
}
