package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs;
        strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));

    }
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            //String배열 strs를 줌
            //같은 anagrams끼리 묶어서 List로 return
            //anagrams이란 각각 요소를 재배열시켜서 만들수있는 단어들
            //모두 소문자로 주어짐

            List<List<String>> answer;
            HashMap<String,List<String>> map = new HashMap<>();
            //String자체를 정렬 시킬순없을까
            for (String str: strs) {
                char[] t = str.toCharArray();
                Arrays.sort(t);
                String target = String.valueOf(t);
                //target으로 정렬된 문자열 완성

                if(map.containsKey(target)){
                    //이미 존재한다면 value값에 있는 리스트에 str 추가
                    map.get(target).add(str);
                }else{
                    //처음이면 list를 만들고 target값을 넣은뒤 map에 추가
                    List<String> temp = new ArrayList<>();
                    temp.add(str);
                    map.put(target,temp);
                }
            }

            answer= new ArrayList<>(map.values());

            return answer;
        }
    }
}
