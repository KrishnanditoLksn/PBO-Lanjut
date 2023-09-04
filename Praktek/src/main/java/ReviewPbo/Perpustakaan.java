package ReviewPbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    protected ArrayList<Koleksi> koleksiArrayList = new ArrayList<>();
    protected ArrayList<Peminjam> peminjamArrayList = new ArrayList<>();
    private String namePerpustakaan, Alamat;

    public Perpustakaan() {
        /*
        TODO()konstruktor kurang rapi
         */
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
            int index = koleksiArrayList.indexOf(koleksi);
            String indexString = "[" + index + "]";

            if (koleksi instanceof Buku buku) {
                System.out.printf("%-8s %-20s %-15s %-12s%n", indexString, buku.getTitle(), buku.getIsbn(), buku.getJumlahHalaman());
            }
            if (koleksi instanceof Majalah majalah) {
                System.out.printf("%-8s %-20s %-15s %-15s %-10s%n", indexString, majalah.getTitle(), majalah.getIssn(), majalah.getSeries(), majalah.getVolume());
            }
            if (koleksi instanceof Dvd dvd) {
                System.out.printf("%-8s %-20s %-15s %-12s%n", indexString, dvd.getTitle(), dvd.getIsbn(), dvd.getFormat());
            }
        }
    }

    public String searchingBookCollection(String title) {
        for (Koleksi koleksi : koleksiArrayList) {
            if (koleksi.getTitle().equalsIgnoreCase(title)) {
                if (koleksi instanceof Majalah majalah) {
                    return String.format("%s %s %s %s %s", majalah.getTitle(), majalah.getIssn(), majalah.getSeries(), majalah.getJumlahHalaman(), majalah.getVolume());
                }
                if (koleksi instanceof Buku buku) {
                    return String.format("%s %s", buku.getTitle(), buku.getIsbn());
                }
                if (koleksi instanceof Dvd dvd) {
                    return String.format("%s %s %s", dvd.getTitle(), dvd.getIsbn(), dvd.getFormat());
                }
            }
        }
        return "Items not found,sorry!!";
    }


    public String borrowBookByIndex(int index) {
        if ((index < 0 || index <= koleksiArrayList.size())) {
            Koleksi koleksi = koleksiArrayList.remove(index);

            if (koleksi instanceof Buku) {
                return "Anda meminjam buku" + "\t" + koleksi.getTitle() + "\t" + ((Buku) koleksi).getIsbn();
            }
            if (koleksi instanceof Majalah) {
                return "Anda meminjam buku" + "\t" + koleksi.getTitle() + "\t" + ((Majalah) koleksi).getIssn();
            }
            if (koleksi instanceof Dvd) {
                return "Anda meminjam buku" + "\t" + koleksi.getTitle() + "\t" + ((Dvd) koleksi).getIsbn() + ((Dvd) koleksi).getFormat();
            }
        }
        return "Out of index !!!";
    }

    public void startMenuShow(Scanner scanner) {
        System.out.println("Selamat datang di perpustakaan" + "\t" + getNamePerpustakaan() + "\t" + "Alamat : " + "\t" + getAlamat());
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
                System.out.println(searchingBookCollection(searcher));
            } else if (userPilihan == 4) {
                System.out.println("Sayonara!!!");
                isRunning = false;
            } else {
                System.out.println("Invalid Option !!!(1-4)");
            }
        }
    }
}