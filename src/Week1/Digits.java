package Week1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {
    private ArrayList<Integer> digits = new ArrayList<>();
    private List<char[]> digitsString = new ArrayList<>();
    private char[] tempChar;
    int numNow;
    public Digits(int num)
    {
        String numString = Integer.toString(num);
        tempChar = numString.toCharArray();
        for (int i = 0; i < numString.length(); i++) {
            digits.add(tempChar[i] - '0');
        }
    }

    public ArrayList<Integer> getDigits() {
        return digits;
    }

    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digits.size() - 1; i++) {
            if(!(digits.get(i) < digits.get(i + 1)))
            {
                return false;
            }
        }
        return true;
    }
}
