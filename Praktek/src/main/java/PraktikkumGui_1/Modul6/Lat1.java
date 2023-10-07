package PraktikkumGui_1.Modul6;

import java.util.Scanner;

public class Lat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jarak perjalanana anda (km): ");
        int jarak = sc.nextInt();
        System.out.println("Masukkan banyaknya bensin yang dihabiskan (liter):");
        int liter = sc.nextInt();
        int konsumsi = jarak / liter;
        System.out.println("Konsumsi BBM anda adalah " + konsumsi + "km/liter");
    }
}