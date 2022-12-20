package lab05.task02;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {

    public Task2(String name) {
        super(name);
        setDefaultCloseOperation(3);
        setBounds(0,50,1000,800);
        setVisible(true);
        add(new MyComponent());
    }

    class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int i = 0; i < 20; i++) {
                int randomNum = (int)(Math.random() * 3);
                if (randomNum == 1) {
                    g.setColor(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
                    g.fillRect(10 + (int)(Math.random() * 730), 50 + (int)(Math.random() * 730), 50, 50);
                } else if (randomNum == 2) {
                    g.setColor(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
                    g.fillOval(10 + (int)(Math.random() * 730), 50 + (int)(Math.random() * 730), 50, 50);
                } else {
                    g.setColor(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
                    g.fillRect(10 + (int)(Math.random() * 730), 50 + (int)(Math.random() * 730), 50, 50);
                }
            }

        }
    }
    public static void main(String[] args) {
        new Task2("MyShapes");


    }
}
