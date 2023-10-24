package PraktikkumGui_1.Modul8;

import java.util.Scanner;

public class Lat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kalimatSatu = sc.nextLine();
//
//        System.out.println("Posisi awal : " + kalimatSatu.indexOf(kalimatSatu.substring(1, 4)));
//        String subStrInput = kalimatSatu.substring(0 , 5 );
//        System.out.println("Posisi akhir : " + kalimatSatu.indexOf(kalimatSatu.substring(3,4)));
//        System.out.println("Output : " + subStrInput);

        System.out.println("Posisi awal : ");
        int inputPosisi1 = sc.nextInt();

        System.out.println("Posisi akhir : ");
        int inputPosisi2 = sc.nextInt();

        String subInputString = kalimatSatu.substring(inputPosisi1, inputPosisi2);
        System.out.println("Output : " + subInputString);
    }
}
