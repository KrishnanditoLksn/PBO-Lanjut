package PraktikkumGui_1.Modul9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class stream6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("res/ucob3.txt"))) {
            //approach 1 : using while
            //untuk menentukan banyak data harus diproses maka menggunakan scanner has next line
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }

            //approach 2 : using string stream
            System.out.println(scanner.delimiter());
            scanner.useDelimiter("$");
            //mencetak aliran stream ke string
            scanner.tokens().forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
