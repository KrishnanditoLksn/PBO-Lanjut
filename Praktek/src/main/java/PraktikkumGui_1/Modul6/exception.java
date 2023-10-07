package PraktikkumGui_1.Modul6;

import javax.swing.*;

public class exception {
    private static final String DEFAULT_MESS = "Your age : ";

    public exception() {

    }

    public int getAge() {
        return getAge(DEFAULT_MESS);
    }

    public int getAge(String prompt) {
        String inputStr;
        int age;
        while (true) {
            inputStr = JOptionPane.showInputDialog(null, prompt);
            try {
                age = Integer.parseInt(inputStr);
                return age;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, " " + inputStr + "' is invalid\n" + "Please enter digits only");
            }
        }
    }
}
