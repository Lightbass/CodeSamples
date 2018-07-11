package ru.repomf.word;

/**
 * Created by a.makarov on 11.07.2018.
 */
import java.util.TreeSet;
import java.util.Set;

public final class WordIndex {
    private final String text;

    public WordIndex(final String text) {
        this.text = text;
    }

    public final Set<Integer> indexOf(final String word) {
        Set<Integer> indexes = new TreeSet<Integer>();

        int index = 0;
        for(int n = 0; n < text.length();){
            if((index = text.indexOf(word, n)) == -1)
                break;
            else{
                indexes.add(index);
                n = index + word.length();
            }
        }

        return indexes;
    }
}