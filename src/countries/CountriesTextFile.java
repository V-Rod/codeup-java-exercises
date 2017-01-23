package countries;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by V-Rod on 1/23/17.
 */
public class CountriesTextFile {
    public static void write () throws IOException {
        String directory = "src/countries";
        Path directoryPath = Paths.get(directory);
        if (Files.notExists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }

        String file = "countries.txt";
        Path filePath = Paths.get(directory, file);
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        Country[] countries = {
                new Country("Puerto Rico"),
                new Country("USA"),
                new Country("Liberia"),
                new Country("Central African Nation")
        };

        FileWriter fileWriter = new FileWriter(filePath.toFile(), true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        for (Country country: countries) {
            printWriter.println(country.name);
        }

        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void read() throws IOException {
        String directory = "src/countries";
        String file = "countries.txt";
        Path filePath = Paths.get(directory, file);
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while (null != line) {
            System.out.println(line.toString());
            line = bufferedReader.readLine();
        }

        fileReader.close();
        bufferedReader.close();
    }
}
