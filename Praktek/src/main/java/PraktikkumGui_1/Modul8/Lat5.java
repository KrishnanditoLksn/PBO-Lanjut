package PraktikkumGui_1.Modul8;

import java.util.Scanner;

public class Lat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input : ");
        String input = sc.next();

        String result = input.replaceAll("[aiueo]", "#");
        System.out.println("Output : " + result);
    }
}
