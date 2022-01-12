package leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s ="abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
        s ="bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
        s ="aab";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            //s 문자열이 주어짐
            //반복되는 문자열중 가장 긴 길이를 찾아라

            HashSet set = new HashSet();
            int start =0;
            int end =0;
            int result =0;
            for (int i = 0; i < s.length(); i++) {
                //포함되어있으면 처음기준값 올리기
                if(set.contains(s.charAt(i))){
                    //System.out.println(s.charAt(start)+"제거");
                    set.remove(s.charAt(start));
                    start++;
                    i--;//앞에 땡긴것과 겹친건지 다시 확인해야됨
                }
                //첫 문자면
                else{
                    //System.out.println(s.charAt(i)+"추가");
                    set.add(s.charAt(i));
                    end++;
                    result = Math.max(result,end -start);
                }
            }


            return result;

        }
    }
}
