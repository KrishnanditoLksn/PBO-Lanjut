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
}
