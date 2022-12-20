package lab05.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1  {
    static int milanScore = 0;
    static int realScore = 0;
    static String lastScorer = "";
    static String winner = "";

    public static void main(String[] args) {


        JFrame frame = new JFrame("Footbol score");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel label1 = new JLabel("Result: " + milanScore + " X " + realScore);
        JLabel label2 = new JLabel("Last Scorer: " + lastScorer);
        JLabel label3 = new JLabel("Winner: " + winner);

        ActionListener Alistener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                if (milanScore > realScore) {
                    winner = "AC Milan";
                } else if (milanScore < realScore) {
                    winner = "Real Madrid";
                } else {
                    winner = "Draw";
                }
                label1.setText("Result: " + milanScore + " X " + realScore);
                label2.setText("Last Scorer: " + lastScorer);
                label3.setText("Winner: " + winner);
            }
        };
        ActionListener Alistener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realScore++;
                lastScorer = "Real Madrid";
                if (milanScore > realScore) {
                    winner = "AC Milan";
                } else if (milanScore < realScore) {
                    winner = "Real Madrid";
                } else {
                    winner = "Draw";
                }
                label1.setText("Result: " + milanScore + " X " + realScore);
                label2.setText("Last Scorer: " + lastScorer);
                label3.setText("Winner: " + winner);
            }
        };
        button1.addActionListener(Alistener1);
        button2.addActionListener(Alistener2);


        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 200));
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
