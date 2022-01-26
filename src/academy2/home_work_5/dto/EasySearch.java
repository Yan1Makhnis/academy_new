package academy2.home_work_5.dto;

import academy2.home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long count=0;
        int index = text.indexOf(word);
        int plusIndex = word.length()+1;
        while(index != -1){
            count++;
            index= text.indexOf(word,index + plusIndex);
        }
        return count;
    }
}
