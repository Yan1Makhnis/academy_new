package academy2.home_work_5.dto;

import academy2.home_work_5.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long count=0;
        Pattern pattern = Pattern.compile("а-яА-я");
        Matcher matcher = pattern.matcher(text);
        return count;
    }
}
