package PraktikkumGui_1.Modul9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class tugasStream {
    public static void main(String[] args) throws IOException {
        File file = new File("res/data.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        PrintWriter writer = new PrintWriter(outputStream);

        String key = "TFTFTFTFTTTFFFT";

        String[] name = {"Joe", "Janet", "Jeff"};
        String[] jawaban = {"TFTFTFTFTTTFFTT", "TFTFTFTFTTTFFFF", "TFTFTFTFTTTFFFT"};

        writer.println(key);
        for (int i = 0; i < name.length; i++) {
            writer.println(name[i]);
            writer.println(jawaban[i]);
        }

        writer.close();
    }
}
