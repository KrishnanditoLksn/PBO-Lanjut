package PraktikkumGui_1.MenuKaryawan;

import javax.swing.*;
import java.awt.*;

public class Dialog extends JFrame {
    public Dialog() {
        JDialog jDialog = new JDialog();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        JPanel jPanel1 = new JPanel(new GridBagLayout());
        JPanel jPanel2 = new JPanel(new GridBagLayout());
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);


        JLabel jLabelTittle = new JLabel("Data Manager");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabelTittle, gridBagConstraints);


        JLabel jLabel1 = new JLabel("Nama : ");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel1, gridBagConstraints);


        JTextField jTextField1 = new JTextField(20);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jTextField1, gridBagConstraints);

        JLabel jLabel2 = new JLabel("NIP : ");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel2, gridBagConstraints);


        JTextField jTextField2 = new JTextField(20);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jTextField2, gridBagConstraints);

        JLabel jLabel3 = new JLabel("Tgl Lahir : ");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel3, gridBagConstraints);

        JTextField jTextField3 = new JTextField(20);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jTextField3, gridBagConstraints);

        jDialog.add(jPanel1);
        jDialog.setBounds(400, 300, 400, 400);
        jDialog.setVisible(true);
        jDialog.setResizable(true);
        jDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Dialog();
    }
}
