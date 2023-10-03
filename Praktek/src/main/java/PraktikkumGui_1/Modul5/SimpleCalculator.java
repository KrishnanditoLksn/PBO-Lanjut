package PraktikkumGui_1.Modul5;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {

    protected JPanel jPanel = new JPanel();//Membuat objek jPanel
    protected JTextField textField1, textField2, result;//Deklarasi variabel untuk teksfield
    protected JLabel input1, input2, hasil;//Deklarasi variabel untuk jLabel
    protected JButton addition, subtraction, multiplication, resetNumber, division, modulo;//Deklarasi variabel untuk jButton

    //Tanpa Konstruktor
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();//Membuat objek simple calculator
        simpleCalculator.calculatorGui();//Memanggil method calculator gui
    }

    public void calculatorGui() {
        jPanel.setLayout(null);

        //Membuat label bilangan 1
        input1 = new JLabel("Bilangan 1");
        input1.setBounds(20, 80, 85, 30);
        jPanel.add(input1);

        //Membuat teks field bilangan 1
        textField1 = new JTextField(20);
        textField1.setBounds(100, 85, 85, 30);
        jPanel.add(textField1);

        //Membuat label untuk bilangan 2
        input2 = new JLabel("Bilangan 2");
        input2.setBounds(20, 120, 85, 30);
        jPanel.add(input2);

        //Membuat teks field untuk bilangan 2
        textField2 = new JTextField(20);
        textField2.setBounds(100, 120, 85, 30);
        jPanel.add(textField2);

        //Membuat label untuk hasil
        hasil = new JLabel("Hasil");
        hasil.setBounds(20, 155, 70, 30);
        jPanel.add(hasil);

        //Membuat teks field untuk hasil
        result = new JTextField(20);
        result.setBackground(Color.WHITE);
        result.setBounds(100, 155, 85, 30);
        result.setEditable(false);//Membuat teksfield tidak bisa diberi input
        jPanel.add(result);

        //Membuat button +
        addition = new JButton("+");
        addition.setBounds(100, 190, 75, 30);
        addition.addActionListener(this);//Menambahkan method action listener
        jPanel.add(addition);

        //Membuat button -
        subtraction = new JButton("-");
        subtraction.setBounds(180, 190, 75, 30);
        subtraction.addActionListener(this);//Menambahkan method action listener
        jPanel.add(subtraction);

        //Membuat button x
        multiplication = new JButton("x");
        multiplication.setBounds(20, 190, 75, 30);
        multiplication.addActionListener(this);//Menambahkan method action listener
        jPanel.add(multiplication);

        //Membuat button /
        division = new JButton("/");
        division.setBounds(20, 230, 75, 30);
        division.addActionListener(this);//Menambahkan method action listener
        jPanel.add(division);

        //Membuat button C
        resetNumber = new JButton("C");
        resetNumber.setBounds(100, 230, 75, 30);
        resetNumber.addActionListener(this);//Menambahkan method action listener
        jPanel.add(resetNumber);

        //Membuat button %
        modulo = new JButton("%");
        modulo.setBounds(180, 230, 75, 30);
        modulo.addActionListener(this);//Menambahkan method action listener
        jPanel.add(modulo);

        //Menambahkan panel ke dalam frame dan mengatur ukuran frame
        this.add(jPanel);
        this.setTitle("Input Data");
        this.setBounds(400, 550, 295, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    //Event untuk button +,-, * , / , C , %

    @Override
    public void actionPerformed(ActionEvent e) {
        String userInput = e.getActionCommand();//Menerima input dari sebuah action
        int buttonResult;//deklarasi variabel int
        String inputNumber1 = textField1.getText();//menerima input user di text field 1 sebagai string
        String inputNumber2 = textField2.getText();//menerima input user di text field 2 sebagai string

        if (inputNumber1.isEmpty() || inputNumber2.isEmpty()) {//jika teks field 1 dan teks 2 kosong
            JOptionPane.showMessageDialog(null, "Semua field harus diisi !!!", "Error", JOptionPane.ERROR_MESSAGE);
            textField1.setBorder(new MatteBorder(2, 2, 2, 2, Color.RED));//apabila text field kosong , muncul border merah
            textField2.setBorder(new MatteBorder(2, 2, 2, 2, Color.RED));//apabila text field kosong , muncul border merah
        } else {
            try {
                textField1.setBorder(UIManager.getLookAndFeelDefaults().getBorder("TextField.border"));
                textField2.setBorder(UIManager.getLookAndFeelDefaults().getBorder("TextField.border"));
                int numberInt = Integer.parseInt(inputNumber1);//Konversi String to Int
                int number2Int = Integer.parseInt(inputNumber2);//Konversi String to Int
                switch (userInput) {
                    case "+" -> {//Switch case pertambahan
                        buttonResult = numberInt + number2Int;
                        result.setText(String.valueOf(buttonResult));//Menampilkan hasil pertambahan
                    }
                    case "-" -> {//Switch case pengurangan
                        buttonResult = numberInt - number2Int;
                        result.setText(String.valueOf(buttonResult));//Menampilkan hasil pengurangan
                    }
                    case "x" -> {//Switch case perkalian
                        buttonResult = numberInt * number2Int;
                        result.setText(String.valueOf(buttonResult));//Menampilkan hasil perkalian
                    }
                    //Jika user memilih C  , maka akan di set null untuk setiap field button number1 , number2 dan juga resultnya
                    case "%" -> {
                        buttonResult = numberInt % number2Int;
                        result.setText(String.valueOf(buttonResult));//Menampilkan hasil modulo
                    }
                    case "/" -> {//Switch case pembagian
                        buttonResult = numberInt / number2Int;
                        result.setText(String.valueOf(buttonResult));
                    }
                    case "C" -> {//Mereset input
                        textField1.setText("");    //GPT SOURCE
                        textField2.setText("");

                        if (inputNumber1.isBlank() && inputNumber2.isBlank()) {
                            result.setText(null);
                        }
                    }
                }

            } catch (NumberFormatException error) {//Menangkap error number exception dan muncul message dialog
                JOptionPane.showMessageDialog(null, "Input harus Integer !!", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException error) {//Menangkap error arithmetic exception
                JOptionPane.showMessageDialog(null, "Tidak bisa dibagi 0", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}