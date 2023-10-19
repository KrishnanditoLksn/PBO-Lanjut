package PraktikkumGui_1.Modul8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kata = sc.nextLine();
        StringTokenizer tokens =new StringTokenizer(kata);

        System.out.println("Jumlah kata ");
        System.out.println(tokens.countTokens());
    }
}
