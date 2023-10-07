package PraktikkumGui_1.Modul6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int a1 = 0, a2 = 0;
        Scanner sc = new Scanner(System.in);
        boolean isRun = false;

        while (!isRun) {
            try {
                System.out.println("bil 1 : ");
                a1 = sc.nextInt();
                System.out.println("bila 2 :");
                a2 = sc.nextInt();
                isRun = true;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("kesalah input");
            }
        }
        System.out.println(a2 + a1);
    }
}
