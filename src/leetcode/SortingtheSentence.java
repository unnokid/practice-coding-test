package leetcode;

import java.util.Arrays;

public class SortingtheSentence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s = "is2 sentence4 This1 a3";
        System.out.println(solution.sortSentence(s));
        s = "Myself2 Me1 I4 and3";
        System.out.println(solution.sortSentence(s));
    }
    static class Solution {
        public String sortSentence(String s) {
            //문장의 맨뒤의 번호 순서대로 정렬해서 return

            String[] temp = s.split(" ");
            String[] result = new String[temp.length];

            for(String target :temp){
                int i = (int) (target.charAt(target.length()-1)-'0');
                result[i-1] = target.substring(0,target.length()-1);
            }


            return String.join(" ",result);
        }
    }
}
