package leetcode;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String allow;
        String[] word;
        allow ="ab";
        word = new String[]{"ad","bd","aaab","baa","badab"};
        System.out.println(solution.countConsistentStrings(allow,word));
        allow ="abc";
        word = new String[]{"a","b","c","ab","ac","bc","abc"};
        System.out.println(solution.countConsistentStrings(allow,word));
    }
    static class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            //allow에 있는 문자열 구성요소로
            //word배열에서 만들수 있는 개수를 return

            int answer =0;
            for (int i = 0; i <words.length ; i++) {
                boolean pass = true;

                for(char ch : words[i].toCharArray()){
                    if(!allowed.contains(String.valueOf(ch))){
                        pass= false;
                        break;
                    }
                }
                if(pass){
                    answer++;
                }
            }
            return answer;
        }
    }
}
