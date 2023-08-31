package ReviewPbo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Peminjam peminjam = new Peminjam();
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.setNamePerpustakaan("Library test");
        perpustakaan.setAlamat("Jl.Paingan");
        System.out.println("Welcome in the menu ");
        perpustakaan.startMenuShow(input);
    }
}