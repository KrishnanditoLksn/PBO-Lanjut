package PraktikkumGui_1.Modul9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class stream5 {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("res/sample4.txt")) {
            char[] block = new char[1000];
            int datas;
            while ((datas = fileReader.read(block)) != -1) {
                System.out.println((char) datas);
                String content = new String(block, 0, datas);
                System.out.printf("---> [%d chars] %s%n", datas, content);
            }
        }

        //read using stream pipeline
        System.out.println("---------------------");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "res/ucob.txt"
        ))) {
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
