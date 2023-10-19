package PraktikkumGui_1.Modul8;

import java.util.Scanner;

public class Lat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kalimat satu : ");
        String kalimatSatu = sc.nextLine();

        System.out.println("Kalimat dua : ");
        String kalimatDua = sc.nextLine();

        System.out.println("Output : "  + kalimatSatu.concat(kalimatDua));
    }
}
