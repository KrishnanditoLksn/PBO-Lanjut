package PraktikkumGui_1.Modul8;

import java.util.Scanner;

public class Lat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        System.out.print("Input kata : ");
        String kata = sc.nextLine();
        stringBuffer.append(kata);
        String reversal = stringBuffer.reverse().toString();
        System.out.print("Reverse kata : ");
        System.out.println(reversal);

        if (reversal.equals(kata)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Bukan palindrom");
        }
    }
}
