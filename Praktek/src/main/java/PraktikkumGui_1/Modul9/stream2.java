package PraktikkumGui_1.Modul9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class stream2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("D:/w3/sample3.data"));
        int i = scanner.nextInt();

        scanner.close();
    }
}
