/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikkumGui_1.Modul7;

import java.util.*;

/**
 *
 * @author EmmanuelDito
 */
public class LatSatu {

    public static void main(String[] args) {//method main
        Scanner sc = new Scanner(System.in);
        int waktu = 0;//menginisiasi variabel waktu bernilai 0

        try {//block try
            System.out.println("Masukkan Jarak Perjalanan Anda (km) : ");
            int jarak = sc.nextInt();
            System.out.println("Masukkan kecepatan kendaraan anda (km/jam):");
            int kecepatan = sc.nextInt();
            waktu = jarak / kecepatan;
        } catch (Exception e) {//block catch dengan exception umum
            System.out.println("Maaf terjadi kesalahan proses perhitungan ");
        } finally {//block finally tetap di eksekusi
            System.out.println("Waktu yang anda butuhkan adalah : " + waktu + " jam");
        }
        System.out.println("Terima Kasih ....");
    }
}