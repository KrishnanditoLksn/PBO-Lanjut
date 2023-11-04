package PraktikkumGui_1.Modul9;

import java.io.*;

//yusuf , dito
public class Utils {
    public static void main(String[] args) throws IOException {
        File file = new File("res/data.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String key = bufferedReader.readLine();
        String[] name = new String[3];
        String[] jawaban = new String[3];
        int[] score = new int[3];

        for (int i = 0; i < name.length; i++) {
            score[i] += 0;
        }

        for (int i = 0; i < name.length; i++) {
            name[i] = bufferedReader.readLine();
            jawaban[i] = bufferedReader.readLine();

            for (int j = 0; j < jawaban[i].length(); j++) {
                if (jawaban[i].charAt(j) == key.charAt(j)) {
                    score[i]++;
                }
            }
        }

        bufferedReader.close();

        File files = new File("res/output.txt.txt");
        FileOutputStream outputStream = new FileOutputStream(files);
        PrintWriter writer = new PrintWriter(outputStream);

        for (int i = 0; i < name.length; i++) {
            writer.println(name[i]);
            writer.println(score[i]);
        }
        writer.close();
    }
}
