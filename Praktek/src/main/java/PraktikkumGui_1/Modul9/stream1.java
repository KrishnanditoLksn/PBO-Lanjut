/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikkumGui_1.Modul9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ASUS
 */
public class stream1 {

    public static void main(String[] args) throws IOException {
        File file = new File("D:/w3/test.txt");
        FileInputStream inputStream = new FileInputStream(file);
        /*   byte []bytesArray = {10,20,30,40,50,60,70,80};*/



        int fileSize = (int) file.length();
        byte[] bytesArray = new byte[fileSize];

        inputStream.read(bytesArray);
        for (int i = 0; i < fileSize; i++) {
            System.out.println(bytesArray[i]);
        }

        inputStream.close();






//            FileReader fileReader = new FileReader(file);
//            BufferedReader buffReader  = new BufferedReader(fileReader);
//            String str;
//            
//            str = buffReader.readLine();
//            int i = Integer.parseInt(str);
//            
//            buffReader.close();
    }
}
