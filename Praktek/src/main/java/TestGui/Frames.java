package TestGui;

import javax.swing.*;


public class Frames extends JFrame {
    public Frames() {
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Testing dito!!!");
        this.setResizable(true);
        this.setVisible(true);

        JPanel jPanel = new JPanel();
        JButton jButton = new JButton();
        JCheckBox jcbTranslate = new JCheckBox("In");
        jcbTranslate.setEnabled(true);
        jPanel.add(jcbTranslate);
        jButton.setText("Im a swing");
        jButton.setBounds(150, 200, 800, 550);
        jPanel.add(jButton);
        jPanel.setSize(250, 350);
        this.add(jPanel);
    }

    public static void main(String[] args) {
        Frames frames = new Frames();
        frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frames.setResizable(true);
        frames.setVisible(true);
    }
}
