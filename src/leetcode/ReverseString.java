package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s;
        s = new char[]{'h','e','l','l','o'};
        solution.reverseString(s);
        s = new char[]{'H','a','n','n','a','h'};
        solution.reverseString(s);
    }
    static class Solution {
        public void reverseString(char[] s) {

            //말 그대로 문자열 뒤집기
            //기억 복잡도 O(1)로 해결하라

            //짝수인지 홀수 길이인지 판별 해야함
            //길이가 짧을때 처리해주기

            //길이가 2부터 처리하기
            if(s.length > 1){
                char temp;
                int start =0;
                int end= s.length-1;
                for (int i = 0; i < s.length/2; i++) {
                    temp = s[start];
                    s[start] = s[end];
                    s[end] = temp;

                    start++;
                    end--;
                }
            }
        }
    }
}
