package lab29.task6;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message) {
        super("Заказ уже добавлен: " + message);
    }
}
