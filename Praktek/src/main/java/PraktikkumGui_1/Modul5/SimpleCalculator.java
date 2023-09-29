package PraktikkumGui_1.Modul5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {

    protected JPanel jPanel = new JPanel();
    protected JTextField textField1, textField2, result;
    protected JLabel input1, input2, hasil;
    protected JButton addition, subtraction, multiplication, resetNumber, division, modulo;

    //Tanpa Konstruktor
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.calculatorGui();
    }

    public void calculatorGui() {
        jPanel.setLayout(null);

        input1 = new JLabel("Bilangan 1");
        input1.setBounds(20, 80, 85, 30);
        jPanel.add(input1);

        textField1 = new JTextField(20);
        textField1.setBounds(100, 85, 85, 30);
        jPanel.add(textField1);

        input2 = new JLabel("Bilangan 2");
        input2.setBounds(20, 120, 85, 30);
        jPanel.add(input2);

        textField2 = new JTextField(20);
        textField2.setBounds(100, 120, 85, 30);
        jPanel.add(textField2);

        hasil = new JLabel("Hasil");
        hasil.setBounds(20, 155, 70, 30);
        jPanel.add(hasil);

        result = new JTextField(20);
        result.setBackground(Color.WHITE);
        result.setBounds(100, 155, 85, 30);
        result.setEditable(false);
        jPanel.add(result);

        addition = new JButton("+");
        addition.setBounds(100, 190, 75, 30);
        addition.addActionListener(this);
        jPanel.add(addition);

        subtraction = new JButton("-");
        subtraction.setBounds(180, 190, 75, 30);
        subtraction.addActionListener(this);
        jPanel.add(subtraction);

        multiplication = new JButton("x");
        multiplication.setBounds(20, 190, 75, 30);
        multiplication.addActionListener(this);
        jPanel.add(multiplication);

        division = new JButton("/");
        division.setBounds(20, 230, 75, 30);
        division.addActionListener(this);
        jPanel.add(division);

        resetNumber = new JButton("C");
        resetNumber.setBounds(100, 230, 75, 30);
        resetNumber.addActionListener(this);
        jPanel.add(resetNumber);

        modulo = new JButton("%");
        modulo.setBounds(180, 230, 75, 30);
        modulo.addActionListener(this);
        jPanel.add(modulo);

        this.add(jPanel);
        this.setTitle("Input Data");
        this.setBounds(400, 550, 500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userInput = e.getActionCommand();
        int buttonResult;
        String inputNumber1 = textField1.getText();
        String inputNumber2 = textField2.getText();

        if (inputNumber1.isEmpty() || inputNumber2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Salah satu field harus diisi !!!","Error!!!",JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int numberInt = Integer.parseInt(inputNumber1);
                int number2Int = Integer.parseInt(inputNumber2);
                switch (userInput) {
                    case "+" -> {
                        buttonResult = numberInt + number2Int;
                        result.setText(String.valueOf(buttonResult));
                    }
                    case "-" -> {
                        buttonResult = numberInt - number2Int;
                        result.setText(String.valueOf(buttonResult));
                    }
                    case "x" -> {
                        buttonResult = numberInt * number2Int;
                        result.setText(String.valueOf(buttonResult));
                    }
                    //Jika user memilih C  , maka akan di set null untuk setiap field button number1 , number2 dan juga resultnya
                    //GPT SOURCE
                    case "%" -> {
                        buttonResult = numberInt % number2Int;
                        result.setText(String.valueOf(buttonResult));
                    }
                    case "C" -> {
                        textField1.setText("");
                        textField2.setText("");
                        result.setText(null);
                    }
                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Input harus Integer !!","Error!!",JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException error) {
                JOptionPane.showMessageDialog(null, "gabisa dibagi 0");
            }
        }
    }
}