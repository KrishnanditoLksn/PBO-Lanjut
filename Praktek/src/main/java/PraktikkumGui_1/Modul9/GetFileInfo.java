package PraktikkumGui_1.Modul9;

import java.io.File;

public class GetFileInfo {

    public static void main(String[] args) {


        File file = new File("D:/w3/test.txt");

        if (file.exists()) {
            System.out.println("File nane : " + file.getName());

            System.out.println("ReadABLE : " + file.canRead());
            System.out.println("File size in bytes " + file.length());
            System.out.println("Path : " + file.getAbsolutePath());
        }

    }
}
