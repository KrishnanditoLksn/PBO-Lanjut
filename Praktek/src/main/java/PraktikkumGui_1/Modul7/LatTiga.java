package PraktikkumGui_1.Modul7;

import java.util.Scanner;

public class LatTiga {
    public static void main(String[] args) {//method main
        LatTiga lat = new LatTiga();//membuat objek lat
        System.out.println("*** INPUT DATA PELAMAR ***");
        boolean ask = true;

        while (ask) {//selama kondisi true akan menginput nim , salah akan terus ulang , kalau benar lanjut  nama
            try {
                System.out.println("NIM: ");
                lat.getNim();
                ask = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        ask = true;
        System.out.println("Nama : ");
        lat.getNama();

        while (ask) {//selama kondisi true akan menginput IPK , salah akan terus ulang , kalau benar loop tampilkan tuilsan
            try {
                System.out.println("IPK : ");
                lat.getIPK();
                ask = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Terima kasih , data sudah kami simpan ....");
    }

    public String getNim() throws Exception {//method get nim melempar error Exception
        Scanner sc = new Scanner(System.in);
        String nim = sc.next();
        if (nim.length() != 9) {
            throw new Exception("Maaf , formt NIM anda salah ");
        }
        return nim;
    }

    public double getIPK() throws Exception {//Method get ipk melempar error Exception
        Scanner sc = new Scanner(System.in);
        double ipk = sc.nextDouble();

        if (ipk < 2.75) {
            throw new Exception("Maaf , jumlah SKS anda tidak memenuhi persyaratan");
        }
        if (ipk > 4.00) {
            throw new Exception("Maaf , IPK tidak boleh melebihi 4.00");
        }
        return ipk;
    }

    public String getNama() {//Method getNama
        Scanner sc = new Scanner(System.in);
        String nama = sc.next();
        return nama;
    }
}
