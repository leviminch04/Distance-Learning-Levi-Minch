package Week3.FRQ1;

import java.util.ArrayList;

public class PoemLine {
    public String convertToAlienLine()
    {
        int startWord = 0;
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> revWords = new ArrayList<>();
        for (int i = 0; i < this.getEnglishLine().length() - 1; i++) {
            if(this.getEnglishLine.charAt(i) == ' ')
            {
                words.add(this.getEnlishLine().substring(startWord, i));
                startWord = i + 1;
            }
        }

        for (int i = words.size() - 1; i >= 0 ; i--) {
            revWords.add(words.get(i));
        }
        return revWords.toString();
    }

}
