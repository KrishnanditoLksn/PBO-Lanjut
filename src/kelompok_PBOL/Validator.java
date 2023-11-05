/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_PBOL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class Validator {

    public static boolean isValidUserName(String username) {
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(username);
        return m.matches();
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(regex);
        return m.matches();
    }

    public static boolean isValidEmail(String email) {
        String regex = "^(.+)@(\\S+)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(regex);
        return m.matches();
    }

    public static boolean isValidAddress(String address) {
        String regex = "^(\\\\d{1,}) [a-zA-Z0-9\\\\s]+(\\\\,)? [a-zA-Z]+(\\\\,)? [A-Z]{2} [0-9]{5,6}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(regex);
        return m.matches();
    }
}
