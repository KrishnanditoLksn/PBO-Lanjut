package PraktikkumGui_1.Modul7;

import java.util.Scanner;

public class Lat7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("Firstname : ");
        String kata1 = sc.nextLine();

        System.out.println("Middlename : ");
        String kata2 = sc.nextLine();

        System.out.println("Lastname : ");
        String kata3 = sc.nextLine();

        stringBuffer.append(kata1);
        stringBuffer.append(kata2);
        stringBuffer.append(kata3);

        System.out.println(stringBuffer);
    }
}
