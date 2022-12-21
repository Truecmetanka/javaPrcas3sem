package lab31.interfaces;


import lab31.classes.Customer;
import lab31.classes.items.MenuItem;

public interface Order {
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemsQuantity(String name);
    int itemsQuantity(MenuItem item);
    MenuItem[] getItems();
    boolean remove(String name);
    boolean remove(MenuItem item);
    int removeAll(String name);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
