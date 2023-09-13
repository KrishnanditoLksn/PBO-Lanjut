package TestGui;

import javax.swing.*;
import java.awt.*;

public class contentPane {
    public static void main(String[] args) {
        JFrame window = new JFrame("Test gui");
        Container container = window.getContentPane();
        JButton jButton1 = new JButton();
        jButton1.setText("Cancel");
        container.add(jButton1);
        int windowWidth = 400;
        int windowHeight = 150;
        window.setBounds(50 , 100 ,windowWidth , windowHeight);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

