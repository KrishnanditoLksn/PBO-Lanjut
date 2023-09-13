package PraktikkumGui_1.Modul3;

import javax.swing.*;

public class FrameKu extends JFrame {
    public FrameKu() {
        JPanel jPanel = new JPanel();
        String[] kata = {"Ya", "Enggak", "Mengapa", "Gak asik"};
        String[] kataRadioButton = {"Ha", "Gpp", "OH OK"};
        ButtonGroup buttonGroup = new ButtonGroup();
        JCheckBox jCheckBox2;
        JButton jButton = new JButton();
        JLabel jLabel = new JLabel();
        JLabel jLabel2 = new JLabel();
        JRadioButton jRadioButton;
        JTextField jTextField = new JTextField();
        jTextField.setColumns(20);
        jLabel.setText("Kamu kenal aku ga ");
        jButton.setText("Tekan biar tio dapat pacar!");
        jLabel2.setText("Ok lanjut ke checkBox");
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jLabel2);
        for (String counter : kataRadioButton) {
            jRadioButton = new JRadioButton(counter);
            buttonGroup.add(jRadioButton);
            jPanel.add(jRadioButton);
        }

        for (String string : kata) {
            jCheckBox2 = new JCheckBox(string);
            jPanel.add(jCheckBox2);
        }
        jPanel.add(jButton);
        this.setBounds(100, 100, 250, 300);
        this.setTitle("Ini class turunan dari class JFrame");
        this.add(jPanel);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameKu();
    }
}
