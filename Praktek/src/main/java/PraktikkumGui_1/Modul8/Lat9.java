package PraktikkumGui_1.Modul8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lat9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah kalimat ");
        String sentence = sc.nextLine();

        StringTokenizer tokens = new StringTokenizer(sentence);

        System.out.println("Kalimat anda terdiri dari kata-kata berikut ini  : ");
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
