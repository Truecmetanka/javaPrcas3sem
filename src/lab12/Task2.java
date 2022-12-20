package lab12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Picture by root");
        setSize(1000, 750);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}

class MyPanel extends JPanel {
    private Image im;

    public MyPanel() {
        try {
            im = ImageIO.read(new File(new Scanner(System.in).nextLine()));
        } catch (IOException ignored) {}
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(im, 50, 50, null);
    }
} //C:\Games\javIm\image_part_001.png
