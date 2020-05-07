package Week4.FRQ1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HiddenWord {
    private ArrayList<String> listNoCaps;
    private ArrayList<String> list;
    private String randoWord;
    private ArrayList<Character> reveal = new ArrayList<Character>();

    public HiddenWord() throws IOException {
        int index;
        listNoCaps = (ArrayList<String>) Files.readAllLines(Paths.get("C:\\Users\\levim\\Documents\\GitHub\\Distance-Learning-Levi-Minch\\src\\Week4\\FRQ1\\Dictionary.txt"), StandardCharsets.UTF_8);
        list = listNoCaps;
        this.toCap();
        index = (int) (Math.random()*list.size());
        this.randoWord = list.get(index);
    }

    public String getHint(String givenWord)
    {
        for (int i = 0; i < randoWord.length(); i++) {
            reveal.set(i, '*');
        }
        for (int i = 0; i < givenWord.length(); i++) {
            for (int j = 0; j < randoWord.length(); j++) {
                if(i != j && givenWord.charAt(i) == randoWord.charAt(j))
                {
                    reveal.set(i, '+');
                }

                if(i == j && givenWord.charAt(i) == randoWord.charAt(j))
                {
                    reveal.set(i, givenWord.charAt(i));
                }
            }
        }

        return reveal.toString();
    }

    private void toCap()
    {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
    }

    public String getListNoCaps() {
        return listNoCaps.toString();
    }

    public ArrayList<String> getList() {
        return list;
    }
}
