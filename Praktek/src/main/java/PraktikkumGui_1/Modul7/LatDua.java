/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikkumGui_1.Modul7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author ASUS
 */
public class LatDua {

    public static void main(String[] args) {//membuat method main
        int s = 0;//menginisiasi variabel s bernilai 0
        int v = 0;//memginisiasi variabel v bernilai 0
        int t = 0;//memginisiasi variabel t bernilai 0

        try {//blok try
            LatDua lat = new LatDua();
            s = lat.getJarak();
            v = lat.getKecepatan();
            t = lat.hitungWaktu(s , v);

        } catch (InputMismatchException e) {//block catch dengan berbagai error
            System.out.println("Maaf terjadi kesalahan input");
        } catch (ArithmeticException e) {
            System.out.println("Maaf terjadi kesalahan proses perhitungan");
        } finally {//block finally tetap di eksekusi
            System.out.println("Waktu yang anda butuhkan adalah " + t + "jam");
        }
        System.out.println("Terima Kasih ......");
    }

    public int getJarak() throws InputMismatchException {//method yang melempar error bernama Input Mismatch Exception
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jarak Perjalanan Anda (km):");
        int jarak = sc.nextInt();
        return jarak;
    }

    public int getKecepatan() throws InputMismatchException {//method yang melempar error bernama Input Mismatch Exception
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kecepatan kendaraan anda (km/jam) :");
        int kecepatan = sc.nextInt();
        return kecepatan;
    }

    public int hitungWaktu(int jarak, int kecepatan) throws ArithmeticException {//mehod menghitung waktu yang melempar error bernama ArithMetic exception
        int waktu = 0;
        waktu = jarak / kecepatan;
        return waktu;
    }
}