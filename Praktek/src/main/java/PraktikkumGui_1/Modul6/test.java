package PraktikkumGui_1.Modul6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isError = false;

        int a1 = 0;
        int a2 = 0;

        do {
            try {
                if (isError) {
                    sc.nextLine(); // Membuang masukan yang salah jika terjadi kesalahan sebelumnya
                }
                System.out.println("Masukkan bilangan pertama: ");
                a1 = sc.nextInt();
                System.out.println("Masukkan bilangan kedua: ");
                a2 = sc.nextInt();
                isError = false; // Reset flag kesalahan
            } catch (InputMismatchException e) {
                isError = true;
                System.out.println("Kesalahan input, masukkan harus berupa bilangan bulat.");
            }
        } while (isError);

        int hasil = a1 + a2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}

