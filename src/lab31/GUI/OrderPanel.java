package lab31.GUI;


import lab31.classes.items.Dish;
import lab31.classes.items.Drink;
import lab31.classes.items.MenuItem;
import lab31.classes.utility.Export;
import lab31.interfaces.Order;
import lab31.interfaces.OrderListener;

import javax.swing.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderPanel extends JPanel {
    private final List<OrderListener> listeners = new ArrayList<>();
    private final Order order;
    private final int orderNumber;
    private final JLabel itemsLabel;
    private final JLabel sumResultLabel;

    private final MenuItem[] items = {
            new Dish(100, "Суп", "Суп из картофеля"),
            new Dish(200, "Салат", "Салат из огурцов"),
            new Drink(300, "Кофе", "Кофе с молоком", false, 0),
            new Drink(400, "Чай", "Чай с медом", false, 0),
            new Drink(990, "Кокосовый латте", "Кокосовый латте с кокосовым молоком", false, 0)
    };

    public OrderPanel(Order order, int orderNumber) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.order = order;
        this.orderNumber = orderNumber;

        JLabel orderLabel = new JLabel
                ("Заказ №"
                        + orderNumber
                        + " от "
                        + order.getCustomer().getFirstName()
                        + ' '
                        + order.getCustomer().getSecondName()
                );

        JLabel sumTextLabel = new JLabel("Сумма");
        JButton addItemButton = new JButton("Добавить блюдо");
        JButton removeItemButton = new JButton("Удалить блюдо");
        JButton removeOrderButton = new JButton("Удалить заказ");

        itemsLabel = new JLabel();
        sumResultLabel = new JLabel();

        for (var component: new JComponent[]
                {
                        orderLabel,
                        itemsLabel,
                        sumTextLabel,
                        sumResultLabel,
                        addItemButton,
                        removeItemButton,
                        removeOrderButton
                }) {
            add(component);
        }

        addItemButton.addActionListener(e -> {
            MenuItem item = (MenuItem) JOptionPane.showInputDialog(
                    null,
                    "Выберите блюдо",
                    "Добавление блюда",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    items,
                    items[0]);
            if (item != null) {
                order.add(item);
                update();
            }
        });

        removeItemButton.addActionListener(e -> {
            MenuItem item = (MenuItem) JOptionPane.showInputDialog(
                    null,
                    "Выберите блюдо",
                    "Удаление блюда",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    order.getItems(),
                    order.getItems()[0]);
            if (item != null) {
                order.remove(item.getName());
                update();
            }
        });

        removeOrderButton.addActionListener(e -> {
            destroy();
        });

        setSize(100, 500);
        update();
    }

    public void update() {
        itemsLabel.setText(Arrays.toString(order.getItems()));
        sumResultLabel.setText(String.valueOf(order.costTotal()));
        Export.saveToFile(order, Path.of("order" + orderNumber + ".txt"));
    }

    public Order getOrder() {
        return order;
    }

    private void destroy() {
        for (var listener: listeners) {
            listener.onOrderRemoved(this);
        }
    }

    public void addRemoveListener(OrderListener listener) {
        listeners.add(listener);
    }
}
