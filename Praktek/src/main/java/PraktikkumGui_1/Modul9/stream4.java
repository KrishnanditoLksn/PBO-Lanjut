package PraktikkumGui_1.Modul9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

public class stream4 {
    public static void main(String[] args) {
        String filePath = "res/ucob3.txt";
        usePath(filePath);
        Path path = Path.of(filePath);
        printPathInfo(path);
        logStatement(path);
        extraInfo(path);
    }

    private static void userFile(String filename) {
        File file = new File(filename);
        boolean fileExists = file.exists();


        System.out.printf("File '%s' '%s%n,", filename, fileExists ? "exists." : "does not exist.");

        if (fileExists) {
            System.out.println("Deleting files  : " + filename);
            fileExists = !file.delete();
        }

        if (!fileExists) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Created File : " + filename);

            if (file.canWrite()) {
                System.out.println("Would write to file here ");
            }
        }
    }

    private static void usePath(String fileName) {
        Path file = Path.of(fileName);
        boolean fileExists = Files.exists(file);


        System.out.printf("File '%s' '%s%n,", fileName, fileExists ? "exists." : "does not exist.");

        if (fileExists) {
            System.out.println("Deleting files  : " + fileName);
            try {
                Files.delete(file);
                fileExists = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!fileExists) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Created File : " + fileName);
            if (Files.isWritable(file)) {
                System.out.println("Would write to file here ");
                try {
                    Files.writeString(file, "Here is some data");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    private static void printPathInfo(Path path) {
        System.out.println("Path : " + path);
        System.out.println("File name : " + path.getFileName());
        System.out.println("parent : " + path.getParent());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path: = " + absolutePath);

        int pathParts = absolutePath.getNameCount();
        for (int i = 0; i < pathParts; i++) {
            System.out.println(".".repeat(i + 1) + " " + absolutePath.getName(i));
        }
    }

    //to create log in file
    private static void logStatement(Path path) {
        try {
            Path parent = path.getParent();
            if (!Files.exists(parent)) {
                Files.createDirectory(parent);
            }
            Files.writeString(path, Instant.now() + ": hello file world \n", StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void extraInfo(Path path) {
        try {
            var atts = Files.readAttributes(path, "*");
            atts.entrySet().forEach(System.out::println);
            System.out.println(Files.probeContentType(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
