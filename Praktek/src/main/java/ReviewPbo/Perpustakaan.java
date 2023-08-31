package ReviewPbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    protected ArrayList<Koleksi> koleksiArrayList = new ArrayList<>();
    private String namePerpustakaan, Alamat;

    public Perpustakaan() {
        koleksiArrayList.add(new Buku("Erlangga", "A223123", "Malin Kundang", "B1", "2004", "120"));
        koleksiArrayList.add(new Buku("Togamas", "A2313123", "Sains", "B2", "2019", "500"));
        koleksiArrayList.add(new Majalah("200", "2020", "Majalah Bobo", "Sinar Dunia", "M1", "Summer 2020", "V-1", "64545456"));
        koleksiArrayList.add(new Majalah("150", "2023", "Majalah gamers", "Togamas", "M2", "Autumn 2023", "V-10", "897897867"));
        koleksiArrayList.add(new Dvd("D1", "2x kuadrat", "5436345", "Nrz-i", "2019", "CD"));
        koleksiArrayList.add(new Dvd("D2", "Wibu pinter", "5345345345", "Manchester", "2020", "DVD"));
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getNamePerpustakaan() {
        return namePerpustakaan;
    }

    public void setNamePerpustakaan(String namePerpustakaan) {
        this.namePerpustakaan = namePerpustakaan;
    }

    public void showingCollectionList() {
        for (Koleksi koleksi : koleksiArrayList) {
            if (koleksi instanceof Buku) {
                System.out.println("\t" + koleksi.getTitle() + "\t" + ((Buku) koleksi).getIsbn() + "\t" + ((Buku) koleksi).getJumlahHalaman());
            }
            if (koleksi instanceof Majalah) {
                System.out.println("\t" + koleksi.getTitle() + "\t" + ((Majalah) koleksi).getIssn() + ((Majalah) koleksi).getSeries() + "\t" + ((Majalah) koleksi).getVolume());
            }
            if (koleksi instanceof Dvd) {
                System.out.println("\t" + koleksi.getTitle() + "\t" + ((Dvd) koleksi).getIsbn() + ((Dvd) koleksi).getFormat());
            }
        }
    }

    public String searchingTheKoleksi(String title) {
        for (Koleksi koleksi : koleksiArrayList) {
            if (koleksi.getTitle().equalsIgnoreCase(title)) {
                if (koleksi instanceof Majalah) {
                    return "\t" + koleksi.getTitle() + ((Majalah) koleksi).getIssn() + ((Majalah) koleksi).getSeries() + ((Majalah) koleksi).getJumlahHalaman() + ((Majalah) koleksi).getVolume();
                }
                if (koleksi instanceof Buku) {
                    return "\t" + koleksi.getTitle() + ((Buku) koleksi).getIsbn();
                }
                if (koleksi instanceof Dvd) {
                    return "\t" + koleksi.getTitle() + ((Dvd) koleksi).getIsbn() + ((Dvd) koleksi).getFormat();

                } else {
                    return "Not of instance class!!!";
                }
            }
        }
        return "Items not found,sorry!!";
    }


    public String borrowBookByIndex(int index) {
        if ((index < 0 || index <= koleksiArrayList.size())) {
            for (Koleksi koleksi : koleksiArrayList) {
            /*
            TODO() pakek get index atau remove
             */

                koleksi = koleksiArrayList.remove(index);
                return "Anda meminjam buku" + koleksi.getTitle();

            }
        }
        return "Diluar batas index";
    }

    public void startMenuShow(Scanner scanner) {
        System.out.println("Selamat datang di perpustakaan" + getNamePerpustakaan() + "Alamat : " + getAlamat());
        boolean isRunning = true;
        int userPilihan;
        while (isRunning) {
            System.out.println("=".repeat(80));
            System.out.println("1.TAMPILKAN KOLEKSI DI PERPUSTAKAAN");
            System.out.println("2.PINJAM BUKU KOLEKSI DI PERPUSTAKAAN");
            System.out.println("3.CARI KOLEKSI DI PERPUSTAKAAN");
            System.out.println("4.KELUAR");
            System.out.println("-".repeat(80));
            userPilihan = scanner.nextInt();
            System.out.println("-".repeat(80));

            if (userPilihan == 1) {
                showingCollectionList();
            } else if (userPilihan == 2) {
                System.out.println("Masukkan index : ");
                int indexInput = scanner.nextInt();
                System.out.println(borrowBookByIndex(indexInput));
            } else if (userPilihan == 3) {
                System.out.println("Judul buku : ");
                String searcher = scanner.next();
                searcher += scanner.nextLine();
                System.out.println(searchingTheKoleksi(searcher));
            } else if (userPilihan == 4) {
                System.out.println("Sayonara!!!");
                isRunning = false;
            } else {
                System.out.println("Invalid Option !!!");
            }
        }
    }
}