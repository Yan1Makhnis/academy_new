package academy2.home_work_5.service;


import academy2.home_work_5.api.ISearchEngine;
import academy2.home_work_5.dto.EasySearch;

import java.nio.file.Files;
import java.nio.file.Path;

public class EasySearchService {
    public void run() {
        String text = null;
        try {
            Path pathToFile = Path.of("C:/task8/vojna.txt");
            text = Files.readString(pathToFile);
        } catch (Exception e) {
            throw new IllegalArgumentException("Ошибка чтения файла");
        }
        EasySearch easySearch = new EasySearch();
        long finalCount = easySearch.search(text, "князь");

        System.out.println("Количество повторений искомого слова - " + finalCount);
    }
}
