package lab29;


import lab29.task6.*;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        var orderManager = new OrderManager();
        orderManager.add("100", new InternetOrder(new Item[]{
                new Dish("Burger", "mm borgar", 100),
                new Dish("Burger", "mm borgar", 100),
        }));
        System.out.println(Arrays.toString(Arrays.stream(orderManager.getOrders()).toArray()));
    }
}
