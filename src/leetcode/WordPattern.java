package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern;
        String s;
        pattern = "abba";
        s = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, s));
    }

    static class Solution {
        public boolean wordPattern(String pattern, String s) {

            //패턴 반복되는지
            Map<Character, String> map = new HashMap<>();
            String[] temp = s.split(" ");
            char[] c = pattern.toCharArray();

            //길이가 같아야함
            if (temp.length != c.length) {
                return false;
            }

            for (int i = 0; i < temp.length; i++) {

                //키가 존재하는ㅈ;
                if (map.containsKey(c[i])) {
                    if (!map.get(c[i]).equals(temp[i])) {
                        return false;
                    }
                }//키는 없는데 value가 존재하는지
                else if (map.containsValue(temp[i])) {
                    return false;
                } else {//아무도 해당안되면 put
                    map.put(c[i], temp[i]);
                }
            }

            return true;
        }
    }
}
