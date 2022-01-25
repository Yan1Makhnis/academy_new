package academy2.home_work_5.main;

import java.nio.file.Files;
import java.nio.file.Path;

public class WarAndPeaceMain1 {
    public static void main(String[] args) {
        String text = null;
        try {
            Path pathToFile = Path.of("C:/task8/vojna.txt");
            text = Files.readString(pathToFile);
        } catch (Exception e) {
            throw new IllegalArgumentException("Ошибка чтения файла");
        }
        System.out.println(text);
    }
}
