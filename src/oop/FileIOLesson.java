package oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class FileIOLesson {
    public static void main(String[] args) {
        createContact();
    }

    public static void createContact() {
        String directory = "./data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);


        try {
//            if (Files.notExists(dataDirectory)) {
//                System.out.println("does not exist.  creating file");
//                Files.createDirectories(dataDirectory); //creates directory if it dont exist
//            }
//            if (!Files.exists(dataFile)) {
//                Files.createFile(dataFile); //create file if it don't exist
//            }
            Files.write(
                    Paths.get("data", "info.txt"),
                    Arrays.asList("eggs"),
                    StandardOpenOption.APPEND
            );

            List<String> fruit = new ArrayList<>();
//            Files.write(
//                    Paths.get("data", "info.txt"),
//                    Arrays.asList(fruit),
//                    StandardOpenOption.APPEND);
            fruit.add("banana");
            fruit.add("tomato");
            fruit.add("kiwi");
            fruit.add("orange");
            Files.write(dataFile, fruit);
            List<String> lines = Files.readAllLines(dataFile);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            System.out.println("Something went wrong :(");
            System.out.println(ioe);
        }
    }
}


