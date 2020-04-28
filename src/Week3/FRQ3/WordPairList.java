package Week3.FRQ3;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> wordList = new ArrayList<>();
    public WordPairList(String[] words)
    {
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                WordPair wordPair = new WordPair(words[i],words[j]);
                wordList.add(wordPair);
            }
        }
    }

    public int numMatches()
    {
        int count = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).getFirst().equals(wordList.get(i).getSecond()))
                count++;
        }
        return count;
    }


}
