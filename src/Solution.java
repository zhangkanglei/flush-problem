import java.util.*;

public class Solution {
    public static int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();

        int i = s.lastIndexOf(" ");

        if (i == -1) {
            return s.length();
        }

        String lastWord = s.substring(i, s.length() - 1);

        return lastWord.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }


}