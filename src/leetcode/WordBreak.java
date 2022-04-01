package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        List<String> wordDict;
        s="leetcode";
        wordDict = new ArrayList<>(Arrays.asList("leet","code"));
        System.out.println(solution.wordBreak(s,wordDict));
        s="catsandog";
        wordDict = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        System.out.println(solution.wordBreak(s,wordDict));
    }
    static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {

            boolean[] map = new boolean[s.length()];


            for (int i = 0; i <map.length ; i++) {
                for (int j = i; j >=0 && map[i] == false; j--) {
                    String temp = s.substring(j,i+1);
                    if(wordDict.contains(temp)){
                        map[i] = j == 0 || map[j - 1];
                    }

                }
            }
            return map[map.length-1];
        }
    }
}
