package leetcode;

public class ReverseString2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        int k;
        s="abcdefg";
        k=2;
        System.out.println(solution.reverseStr(s,k));
        s="abcd";
        k=2;
        System.out.println(solution.reverseStr(s,k));
    }
    static class Solution {
        public String reverseStr(String s, int k) {

            char[] ch = s.toCharArray();

            for (int i = 0; i < ch.length; i+=2*k) {
                int start = i;
                int end = Math.min(i+k-1,ch.length-1);

                while(start < end){
                    char temp = ch[start];
                    ch[start++] = ch[end];
                    ch[end--] = temp;
                }
            }

            return new String(ch);


        }
    }
}
