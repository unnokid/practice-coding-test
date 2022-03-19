package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ransom;
        String magazine;
        ransom ="a";
        magazine = "b";
        System.out.println(solution.canConstruct(ransom,magazine));
        ransom ="aa";
        magazine = "aab";
        System.out.println(solution.canConstruct(ransom,magazine));
    }
    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            //둘다 모두 소문자로만 이루어져 있다
            //magazine의 글자들로 ransomNote를 만들 수 있으면 true, 아니면 false
            Map<Character,Integer> m = new HashMap<>();

            for (int i = 0; i <magazine.length() ; i++) {
                char target = magazine.charAt(i);
                m.put(target,m.getOrDefault(target,0)+1);
            }
            //잡지에 대한 정보 다 넣음

            for (int i = 0; i <ransomNote.length() ; i++) {
                char temp = ransomNote.charAt(i);
                if(!m.containsKey(temp) || m.get(temp) <= 0){
                    return false;
                }
                m.put(temp,m.getOrDefault(temp,0)-1);
            }

            return true;
        }
    }
}
