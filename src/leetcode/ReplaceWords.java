package leetcode;

import java.util.*;

public class ReplaceWords {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> dictionary;
        String sentence;
        dictionary = new ArrayList<String>(
                Arrays.asList("cat","bat","rat"));
        sentence = "the cattle was rattled by the battery";
        System.out.println(solution.replaceWords(dictionary,sentence));

        dictionary = new ArrayList<String>(
                Arrays.asList("a","b","c"));
        sentence = "aadsfasf absbs bbab cadsfafs";
        System.out.println(solution.replaceWords(dictionary,sentence));
        dictionary = new ArrayList<String>(
                Arrays.asList("a", "aa", "aaa", "aaaa"));
        sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
        System.out.println(solution.replaceWords(dictionary,sentence));

    }
    static class Solution {
        public String replaceWords(List<String> dictionary, String sentence) {
            //dictionary에 나온 앞글자와 같은 문장을 바꿔주기

            Set<String> set = new HashSet();
            for (String target: dictionary) {
                set.add(target);
            }

            StringBuilder sb = new StringBuilder();
            String[] words = sentence.split(" ");
            for (String word: words) {
                String temp = "";
                for (int i = 1; i <= word.length(); ++i) {
                    temp = word.substring(0, i);
                    if (set.contains(temp)){
                        break;
                    }
                }
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(temp);
            }
            return sb.toString();
        }
    }
}
