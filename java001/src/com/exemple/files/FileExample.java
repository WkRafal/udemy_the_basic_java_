package com.exemple.files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {

        File file = new File("files\\testFile.txt");

        if (!file.exists()) {
            boolean fileCreated = file.createNewFile();
            System.out.println("Wynik utworzenia pliku: " + fileCreated);
        }else {
            System.out.println("plik istnieje");

            System.out.println("czy mozna czytac plik: " + file.canRead());

            System.out.println("czy mozna zapisac na pliku: " + file.canWrite());

            System.out.println("czy to zwykly plik: " + file.isFile());

            System.out.println("czy to jest katalog: " + file.isDirectory());

            System.out.println("nazwa pliku: " + file.getName());

            System.out.println("katolog w ktorym jest plik: " + file.getParent());

            System.out.println("path: " + file.getPath());

            System.out.println("absolut path: " + file.getAbsolutePath());

            System.out.println("czy jest to ukryty plik: " + file.isHidden());

            long lastModified = file.lastModified();
            System.out.println("ostatnio zmodyfikowany: " + (new Date(lastModified)));

            System.out.println("wielkoscpliku: " + file.length());
        }

        File filesDir = new File("files");
        if (filesDir.exists()) {
            String files[] = filesDir.list();

            for (String f :files) {
                System.out.println(f);
        }


            File dir = new File("files\\test_dir");
            if (!dir.exists()) {
                dir.mkdir();
            }
        }

    }
}
