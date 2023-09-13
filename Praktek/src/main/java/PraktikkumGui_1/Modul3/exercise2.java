package PraktikkumGui_1.Modul3;

import javax.swing.*;

public class exercise2 extends JFrame {
    public exercise2() {
        JPanel jPanel = new JPanel();
        JCheckBox jCheckBox2;
        JLabel jLabel = new JLabel();
        JRadioButton jRadioButton;
        JTextField jTextField = new JTextField();
        String[] kata = {"Ya", "Enggak", "Mengapa", "Gak asik"};
        String[] kataRadioButton = {"Ha", "Gpp", "OH OK"};
        ButtonGroup buttonGroup;
        jTextField.setColumns(20);

        jLabel.setText("Kamu kenal aku ga ");
        this.setBounds(100, 100, 250, 300);
        this.setTitle("Ini class turunan dari class JFrame");
        jPanel.add(jLabel);
        jPanel.add(jTextField);

        for (String counter : kataRadioButton) {
            jRadioButton = new JRadioButton(counter);
            buttonGroup = new ButtonGroup();
            buttonGroup.add(jRadioButton);
            jPanel.add(jRadioButton);
        }

        for (String string : kata) {
            jCheckBox2 = new JCheckBox(string);
            jPanel.add(jCheckBox2);
        }

        this.add(jPanel);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new exercise2();
    }
}
