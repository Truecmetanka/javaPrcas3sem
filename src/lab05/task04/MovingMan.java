package lab05.task04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;

public class MovingMan extends JComponent implements ActionListener {

    private int x = 0;
    private static Timer timer;
    private static ArrayList<Image> images = new ArrayList<>(); //тут храним картиночки для анимации
    private static File[] files = new File("C:\\Games\\javIm").listFiles();
    int i = 0;

    public MovingMan(int delay) { //конструктор создает таймер
        timer = new Timer(delay, this);
        setPreferredSize(new Dimension(1500, 750));
    }

    public static void fillMass() {
        for (File f : files) { //заполняем массив картиночек картиночками
            images.add(new ImageIcon(f.getAbsolutePath()).getImage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        repaint();
        if (i < 29) {
            i++;
        } else i = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(images.get(i), x +=6.5, 0, null);
        if (x >= 1420) x = -200;
        if (x < -200) x = 1420;
    }

    public static void main(String[] args) {
        fillMass();
        JFrame frame = new JFrame("Moving man");
        JPanel panel = new JPanel();
        MovingMan MovingMan1 = new MovingMan(25);
        panel.add(MovingMan1);
        frame.getContentPane().add(panel);
        timer.start();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 750);
        frame.setVisible(true);
    }
}

