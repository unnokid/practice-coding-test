package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] word1;
        String[] word2;
        word1 = new String[]{"leetcode","is","amazing","as","is"};
        word2 = new String[]{"amazing","leetcode","is"};
        System.out.println(solution.countWords(word1,word2));
        word1 = new String[]{"b","bb","bbb"};
        word2 = new String[]{"a","aa","aaa"};
        System.out.println(solution.countWords(word1,word2));
    }
    static class Solution {
        public int countWords(String[] words1, String[] words2) {
            //두 문자열

            Map<String,Integer> map1 = new HashMap<>();
            Map<String,Integer> map2 = new HashMap<>();
            for(String s : words1){
                map1.put(s,map1.getOrDefault(s,0)+1);
            }
            for(String s : words2){
                map2.put(s,map2.getOrDefault(s,0)+1);
            }
            int answer =0;

            for(Map.Entry<String,Integer> map : map1.entrySet()){
                String target = map.getKey();
                int count = map.getValue();
                if(count ==1 && map2.getOrDefault(target,0) == 1){
                    //map1과 map2에서 모두 값이 1이라면 카운트
                    answer++;
                }
            }
            return answer;
        }
    }
}
