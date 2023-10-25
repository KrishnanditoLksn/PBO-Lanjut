package UTS_225314024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Objects;

public class KtpGui extends JFrame {
    public KtpGui() {
        JMenuBar menuBar1 = new JMenuBar();
        JMenu menu1 = new JMenu("Program");
        JMenuItem menuItem1 = new JMenuItem();
        JMenuItem menuItem2 = new JMenuItem();
        JPanel jPanel = new JPanel();
        menuItem1.setText("KTP");
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dateComboBox = 0;
                int monthComboBox = 0;
                JLabel nama, tglLahir;
                JFrame frame = new JFrame();
                JTextField namaField;
                JLabel alamatLabel;
                JButton tambahButton;
                JPanel panel1 = new JPanel();


                nama = new JLabel("Nama  : ");
                namaField = new JTextField();
                nama.setBounds(22, 50, 90, 15);
                namaField.setBounds(100, 50, 150, 15);


                tglLahir = new JLabel("Tanggal Lahir : ");
                tglLahir.setBounds(20, 90, 90, 15);

                JComboBox<Integer> dateCombo = new JComboBox<>();
                for (int i = 1; i <= 31; i++) {
                    dateComboBox++;
                    dateCombo.addItem(dateComboBox);
                }
                dateCombo.setBounds(120, 90, 50, 19);

                JComboBox<Integer> monthCombo = new JComboBox<>();
                for (int i = 1; i <= 12; i++) {
                    monthComboBox++;
                    monthCombo.addItem(monthComboBox);
                }
                monthCombo.setBounds(180, 90, 50, 19);


                JComboBox<Integer> yearCombo = new JComboBox<>();
                int yearComboBox = 2015;
                for (int i = yearComboBox; i > 1990; i--) {
                    yearComboBox--;
                    yearCombo.addItem(yearComboBox);
                }
                yearCombo.setBounds(240, 90, 60, 19);


                tambahButton = new JButton("Tambah");
                tambahButton.setBounds(180, 250, 100, 19);
                alamatLabel = new JLabel();
                JTextArea alamatTextArea;
                alamatTextArea = new JTextArea();
                alamatLabel.setText("Alamat : ");
                alamatLabel.setBounds(30, 140, 90, 15);
                alamatTextArea.setBounds(100, 140, 140, 70);

                tambahButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String namaKtp = namaField.getText();
                            String tanggal_lahir = Objects.requireNonNull(dateCombo.getSelectedItem()).toString();
                            String bulan_lahir = Objects.requireNonNull(monthCombo.getSelectedItem()).toString();
                            String alamat_user = alamatTextArea.getText();

                            if (namaKtp.isEmpty() || tanggal_lahir.isEmpty() || bulan_lahir.isEmpty() || alamat_user.isEmpty()) {
                                throw new InputMismatchException("Harus diisi ");
                            } else {
                                String data_user_ktp = "NAMA : " + namaKtp + "\n" + tanggal_lahir + "\n" + "Alamat : " + alamat_user;
                                System.out.println(tanggal_lahir);
                                JOptionPane.showMessageDialog(null, data_user_ktp);
                            }

                        } catch (InputMismatchException error) {
                            JOptionPane.showMessageDialog(null, "error ", "Error harus  diisi ", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });


                panel1.add(nama);
                panel1.add(namaField);
                panel1.add(tglLahir);
                panel1.add(dateCombo);
                panel1.add(monthCombo);
                panel1.add(yearCombo);
                panel1.add(alamatLabel);
                panel1.add(alamatTextArea);
                panel1.add(tambahButton);
                panel1.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(250, 300, 500, 500);
                frame.add(panel1);
                frame.setVisible(true);
            }
        });
        menuItem1.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem1.setBackground(Color.LIGHT_GRAY);
        menu1.add(menuItem1);
        menuItem2.setText("Keluar");
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuItem2.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        menuItem2.setBackground(Color.LIGHT_GRAY);
//        menuItem2.addActionListener(button);
        menu1.add(menuItem2);
        menu1.addSeparator();


        //Mengatur jenis font untuk menu
        menu1.setFont(new Font("Segoe UI", Font.BOLD, 12));
        menuBar1.add(menu1);
        menuBar1.setBackground(Color.GRAY);
        jPanel.add(menuBar1);
        this.setJMenuBar(menuBar1);
        this.setTitle("Test Menu");
        this.add(jPanel);
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new KtpGui();
    }
}
