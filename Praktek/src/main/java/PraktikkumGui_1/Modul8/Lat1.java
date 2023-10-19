package PraktikkumGui_1.Modul8;

import java.util.Scanner;

public class Lat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Karakter-1 : ");
        String k1 = sc.next();

        System.out.println("Karakter 2 : ");
        String k2 = sc.next();

        if (k1.compareTo(k2) > 0) {
            System.out.println("Karakter pertama lebih besar dari pada karakter  1 ");
        } else if (k1.compareTo(k2) < 0) {
            System.out.println("Karakter pertama leibh kecil dari pada karakter 2 ");
        } else {
            System.out.println("Kedua karakter adalah sama ");
        }
    }
}
