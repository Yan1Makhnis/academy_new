package academy2.home_work_5.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class WarAndPeaceService2 {
    public void run() {
        BufferedReader reader = null;
        Path pathToFile = Path.of("C:/task8/vojna.txt");

        try {
            reader = new BufferedReader(new FileReader(pathToFile.toFile()));
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла");
        }

        List<String> data = new ArrayList<>();

        try {
            int charFromFile;
            StringBuilder builder = new StringBuilder();
            while ((charFromFile = reader.read()) != -1) {

                if (Character.isLetterOrDigit(charFromFile)) {
                    builder.append((char) charFromFile);
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


        Map<String, Integer> map = new HashMap<>();
        for (String word : data) {
            // если уже есть ключ, то прибавляем единицу
            if (map.keySet().contains(word)) {
                map.put(word, map.get(word) + 1);
                // если нет, то кладем ключ и присваиваем значение 1
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Количество ключей в тексте: " + map.keySet().size());
        System.out.println("-----------------------------------");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        Scanner console = new Scanner(System.in);
        System.out.println("Введите необходимое количество N самых употребляемых слов");
        int n = console.nextInt();
        System.out.println("Самые употребляемые слова в порядке убывания: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }

        console.close();
    }


}
