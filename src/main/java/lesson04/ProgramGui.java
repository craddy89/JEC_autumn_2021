package lesson04;

import javax.swing.*;


public class ProgramGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        JTextField text = new JTextField("          ");
        JButton button = new JButton("OK");
        button.addActionListener(e -> text.setText("Clicked!!"));
        JPanel panel = new JPanel();
        panel.add(text);
        panel.add(button);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
