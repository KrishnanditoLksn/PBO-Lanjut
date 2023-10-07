package PraktikkumGui_1.Modul6;

import TestGui.AgeInputVer4;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ch8AgeInputMain {
    public static void main(String[] args) throws Exception {
        GregorianCalendar today;
        int age, thisYear, bornYr, answer;
        AgeInputVer4 input = new AgeInputVer4();

        age = input.getAge("How old are you ? ");
        today = new GregorianCalendar();
        thisYear = today.get(Calendar.YEAR);
        bornYr = thisYear - age;
        answer = JOptionPane.showConfirmDialog(null, "Already had you birthday this year ?", ",", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.YES_NO_OPTION) {
            bornYr--;
        }
    }
}
