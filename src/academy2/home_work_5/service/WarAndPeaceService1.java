package academy2.home_work_5.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class WarAndPeaceService1 {
    public void run() {
        BufferedReader reader = null;
        Path pathToFile = Path.of("C:/task8/vojna.txt");

        try {
            reader = new BufferedReader(new FileReader(pathToFile.toFile()));
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла");
        }

        Set<String> data = new HashSet<>();

        try {
            int charFromFile;
            StringBuilder builder = new StringBuilder();
            while ((charFromFile =  reader.read()) != -1) {

                if (Character.isLetterOrDigit(charFromFile)) {
                    builder.append((char)charFromFile);
                } else {
                    if (builder.length() > 0) {
                        data.add(builder.toString());
                        builder.setLength(0);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Проблемы при чтении файла");
        }
        System.out.println(data);
        System.out.println("Количество использованных слов - "+ data.size());
    }
}
