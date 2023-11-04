package PraktikkumGui_1.Modul9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class stream3 {
    public static void main(String[] args) throws IOException {

        System.out.println("Pwd =  " + new File("").getAbsolutePath());
        String filenme = "res/sample3.txt";

        testFile2(filenme);
        File file = new File(new File(" ").getAbsolutePath(), filenme);
        System.out.println(file.getAbsolutePath());

        if (!file.exists()) {
            System.out.println("Its not existed !!!");
            System.out.println("Ok quit");
            return;
        }
        System.out.println("Im good to go");

        for (File f : File.listRoots()) {
            System.out.println(f);
        }
    }

    private static void testFile2(String filename) {

        try (FileReader reader = new FileReader(filename)) {
        } catch (FileNotFoundException e) {
            System.out.println("File : " + filename + "does not exists");
            throw new RuntimeException(e);
        } catch (NullPointerException | IllegalArgumentException badData) {
            System.out.println("User had added bad data  " + badData.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Somethings unrelated and unexpected happened");
        } finally {
            System.out.println("Maybe either way !!");
        }
        System.out.println("File exists ");
    }
}
