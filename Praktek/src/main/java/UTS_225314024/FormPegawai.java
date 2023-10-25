package UTS_225314024;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
public class FormPegawai extends JFrame {
    private static final int FRAME_WIDTH = 350;//Membuat variabel frame width
    private static final int FRAME_HEIGHT = 300;//Membuat variabel frame height
    private static final int BUTTON_HEIGHT = 40;//Membuat variable button height
    private static final int BUTTON_WIDTH = 100;//Membuat variable button width
    JLabel nipLabel, namaLabel, jenisKelaminLabel, alamatLabel;
    JTextField nipField, namaField;
    JTextArea alamatTextArea;
    JRadioButton priaRadioButton, wanitaRadioButton;


    public FormPegawai() {
        Container contentPane = getContentPane();


        //field untuk membuat field nip

        nipLabel = new JLabel();
        nipField = new JTextField();
        nipLabel.setText("NIP : ");
        nipLabel.setBounds(22, 30, 90, 15);
        nipField.setBounds(117, 30, 150, 15);
        contentPane.add(nipLabel);
        contentPane.add(nipField);


        namaLabel = new JLabel();
        namaField = new JTextField();
        namaLabel.setText("NAMA : ");
        namaLabel.setBounds(22, 50, 90, 15);
        namaField.setBounds(100, 50, 150, 15);
        contentPane.add(namaLabel);
        contentPane.add(namaField);


        jenisKelaminLabel = new JLabel();
        jenisKelaminLabel.setText("Jenis Kelamin :  ");
        jenisKelaminLabel.setBounds(22, 100, 90, 15);
//        String[] jenisKelamin = {"PRIA", "WANITA"};
//        ButtonGroup buttonGroup = new ButtonGroup();
//        int lebar = 110;
//        for (String string : jenisKelamin) {
//            JRadioButton jRadioButton = new JRadioButton(string);
//            buttonGroup.add(jRadioButton);
//            jRadioButton.setBounds(lebar, 100, 90, 15);
//            lebar += 100;
//            contentPane.add(jRadioButton);
//        }

        priaRadioButton = new JRadioButton();
        wanitaRadioButton = new JRadioButton();


        priaRadioButton.setBounds(100, 100, 90, 15);
        wanitaRadioButton.setBounds(190, 100, 90, 15);


        contentPane.add(priaRadioButton);
        contentPane.add(wanitaRadioButton);

        priaRadioButton.setText("Pria");
        wanitaRadioButton.setText("wanita");


        alamatLabel = new JLabel();
        alamatTextArea = new JTextArea();
        alamatLabel.setText("Alamat : ");
        alamatLabel.setBounds(30, 140, 90, 15);
        alamatTextArea.setBounds(100, 140, 140, 70);
        contentPane.add(alamatLabel);
        contentPane.add(alamatTextArea);


        JButton okButton = getButton();
        contentPane.add(okButton);


        contentPane.setLayout(null);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    @NotNull
    private JButton getButton() {
        JButton okButton = new JButton("TAMBAH ");
        okButton.addActionListener(e -> {
            JDialog jDialog = new JDialog();
            JPanel panel1 = new JPanel();


            String nip = nipField.getText();
            String nama = namaField.getText();
            String alamat = alamatTextArea.getText();
            String priaInput = priaRadioButton.getText();
            String wanitaInput = wanitaRadioButton.getText();


            nipLabel.setBounds(22, 30, 90, 15);
            panel1.add(nipLabel);


            JLabel nipLabelInput = new JLabel();
            nipLabelInput.setText(nip);
            nipLabelInput.setBounds(50, 30, 90, 15);
            panel1.add(nipLabelInput);


            namaLabel.setBounds(22, 60, 90, 15);
            panel1.add(namaLabel);

            JLabel namaLabelInput = new JLabel();
            namaLabelInput.setText(nama);
            namaLabelInput.setBounds(60, 50, 90, 15);
            panel1.add(namaLabelInput);


            JLabel jenisKelaminpriaInput = new JLabel("Jenis Kelamin  : ");
            jenisKelaminpriaInput.setBounds(30, 100, 90, 15);
            panel1.add(jenisKelaminpriaInput);

            JLabel priaRadio = new JLabel();
            priaRadio.setBounds(100, 100, 90, 15);
            priaRadio.setText(priaInput);
            panel1.add(priaRadio);

            alamatLabel.setBounds(22, 120, 90, 15);
            panel1.add(alamatLabel);

            JLabel alamatRadio = new JLabel();
            alamatRadio.setText(alamat);
            alamatRadio.setBounds(35 , 120 , 90 , 15);
            panel1.add(alamatRadio);

            jDialog.add(panel1);
            jDialog.setBounds(300, 450, 300, 400);
            jDialog.setVisible(true);
        });
        okButton.setBounds(100, 250, BUTTON_WIDTH, BUTTON_HEIGHT);
        return okButton;
    }

    public static void main(String[] args) {
        FormPegawai formPegawai = new FormPegawai();
        formPegawai.setTitle("Form Pegawai");
        formPegawai.setVisible(true);
        formPegawai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
