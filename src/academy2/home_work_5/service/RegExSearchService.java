package academy2.home_work_5.service;


import academy2.home_work_5.dto.RegExSearch;

import java.nio.file.Files;
import java.nio.file.Path;

public class RegExSearchService {
    public void run() {
        String text = null;
        try {
            Path pathToFile = Path.of("C:/task8/vojna.txt");
            text = Files.readString(pathToFile);
        } catch (Exception e) {
            throw new IllegalArgumentException("Ошибка чтения файла");
        }
        RegExSearch regexsearch = new RegExSearch();
        long finalCount = regexsearch.search(text, "князь");

        System.out.println("Количество повторений искомого слова - " + finalCount);
    }
}
