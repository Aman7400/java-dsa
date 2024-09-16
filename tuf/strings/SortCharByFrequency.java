package tuf.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCharByFrequency {

    class Pair {
        int freq;
        char ch;

        Pair(int freq, char ch) {
            this.ch = ch;
            this.freq = freq;
        }

    }

    public static void main(String[] args) {
        SortCharByFrequency sol = new SortCharByFrequency();
        String s = "sortcharbyfrequency";
        List<Character> result = sol.frequencySort(s);
        System.out.println(result);
    }

    public List<Character> frequencySort(String s) {

        Pair freqHash[] = new Pair[26];

        for (int i = 0; i < 26; i++) {
            freqHash[i] = new Pair(0, (char) (i + 'a'));
        }

        for (char ch : s.toCharArray()) {
            freqHash[ch - 'a'].freq++;
        }

        Arrays.sort(freqHash, (p1, p2) -> {
            if (p1.freq != p2.freq)
                return p2.freq - p1.freq;
            return p1.ch - p2.ch;
        });

        List<Character> result = new ArrayList<>();
        for (Pair p : freqHash) {
            if (p.freq > 0)
                result.add(p.ch);
        }
        return result;

    }

}