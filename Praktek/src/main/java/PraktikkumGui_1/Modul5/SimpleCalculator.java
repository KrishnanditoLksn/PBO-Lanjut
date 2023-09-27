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
        input1 = new JLabel("Bilangan 1");
        input1.setBounds(20, 20, 80, 30);
        jPanel.add(input1);

        textField1 = new JTextField(20);
        textField1.setBounds(25, 20, 100, 60);
        jPanel.add(textField1);

        input2 = new JLabel("Bilangan 2");
        input2.setBounds(25, 30, 85, 30);
        jPanel.add(input2);

        textField2 = new JTextField(20);
        textField2.setBounds(300, 450, 100, 60);
        jPanel.add(textField2);


        hasil = new JLabel("Hasil");
        jPanel.add(hasil);

        result = new JTextField(20);
        result.setBackground(Color.WHITE);
        result.setEditable(false);
        jPanel.add(result);

        addition = new JButton("+");
        addition.addActionListener(this);
        jPanel.add(addition);

        subtraction = new JButton("-");
        subtraction.addActionListener(this);
        jPanel.add(subtraction);

        multiplication = new JButton("x");
        multiplication.addActionListener(this);
        jPanel.add(multiplication);

        division = new JButton("/");
        division.addActionListener(this);
        jPanel.add(division);

        resetNumber = new JButton("C");
        resetNumber.addActionListener(this);
        jPanel.add(resetNumber);

        modulo = new JButton("%");
        modulo.addActionListener(this);
        jPanel.add(modulo);

        this.add(jPanel);
        this.setTitle("Input Data");
        this.setBounds(250, 300, 500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userInput = e.getActionCommand();
        int buttonResult;
        try {
            int numberInt = Integer.parseInt(textField1.getText());
            int number2Int = Integer.parseInt(textField2.getText());
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
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "gabisa geblek , eh kasar");
        }
    }
}