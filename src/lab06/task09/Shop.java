package lab06.task09;

public class Shop implements Printable {

    private String name;
    private Book[] books = new Book[3];

    public Shop(String name) {
        this.name = name;
    }

    public void fillShop(String name1, String name2, String name3) {
        this.books[0] = new Book(name1);
        this.books[1] = new Book(name2);
        this.books[2] = new Book(name3);
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
