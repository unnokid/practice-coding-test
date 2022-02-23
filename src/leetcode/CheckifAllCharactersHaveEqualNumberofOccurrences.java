package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckifAllCharactersHaveEqualNumberofOccurrences {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="abacbc";
        System.out.println(solution.areOccurrencesEqual(s));
        s="aaabb";
        System.out.println(solution.areOccurrencesEqual(s));
    }
    static class Solution {
        public boolean areOccurrencesEqual(String s) {
            //문자열 s를 줄때 모든 알파벳의 사용횟수가 동일하면 true
            //아니면 false를  return 해라
            Map<Character, Integer> map = new HashMap<>();
            boolean pass= false;
            for (int i = 0; i <s.length() ; i++) {
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }else{
                    map.put(s.charAt(i),1);
                }
            }
            int count =0;
            for(char target: map.keySet()){
                if(!pass){
                    pass= true;
                    count = map.get(target);
                }else{
                    if(count != map.get(target)){
                        return false;
                    }
                }
            }

            return  true;
        }
    }
}
