package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x;
        x=121;
        System.out.println(solution.isPalindrome(x));
        x=-121;
        System.out.println(solution.isPalindrome(x));
        x=10;
        System.out.println(solution.isPalindrome(x));
        x=11;
        System.out.println(solution.isPalindrome(x));
    }
    static class Solution {
        public boolean isPalindrome(int x) {
            //정수 x를 줄때 이 정수가 회문인지 판단 return

            //음수면 불가능
            if(x <0){
                return false;
            }
            String s = String.valueOf(x);
            int start =0;
            int end =0;
            //짝수, 홀수인지 판별해서 인덱스 부여
            if(s.length()%2==1){
                start = s.length()/2;
                end = s.length()/2;
            }else{
                start = s.length()/2-1;
                end = s.length()/2;
            }

            //각 기준 인덱스에서 대칭인지 판단
            while(start>=0 && end < s.length()){
                if(s.charAt(start) == s.charAt(end)){
                    start--;
                    end++;
                }else{
                    break;
                }
            }
            start++;
            end--;

            //만약 끝과 끝으로 끝났으면 대칭
            if(start==0 && end == s.length()-1){
                return true;
            }else{
                return  false;
            }

        }
    }
}
