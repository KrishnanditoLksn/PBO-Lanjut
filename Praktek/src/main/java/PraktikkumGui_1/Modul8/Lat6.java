package PraktikkumGui_1.Modul8;

import java.util.Scanner;

public class Lat6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata = input.next();

        kata = kata.replaceAll("a", "4");
        kata = kata.replaceAll("i", "3");
        kata = kata.replaceAll("e", "3");
        kata = kata.replaceAll("o", "0");
        kata = kata.replaceAll("u", "11");
        System.out.println(kata);
    }
}
