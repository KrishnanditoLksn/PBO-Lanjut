package PraktikkumGui_1.Modul8;

import java.util.Arrays;
import java.util.Scanner;

public class Lat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kata :");
        String str = sc.nextLine();

        char[] chars =  str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);


    }
}

