package leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="babad";
        System.out.println(solution.longestPalindrome(s));

    }
    static class Solution {
        public String longestPalindrome(String s) {

            //문자열 s에서 양쪽이 대칭인 문자열 구하기

            String result ="";
            //최소 2개이상은 되야함
            if(s.length() <2){
                return s;
            }

            //홀수 짝수 따로 판별해야함
            //전체 배열의 한 지점을 주며 스타트
            for (int i = 0; i <s.length() ; i++) {
                String odd = check(s,i,i);//홀수니까 한개
                String even = check(s,i,i+1);//짝수니까

                //회문 짝수일때랑 홀수일때 가져옴
                if(odd.length() > result.length()){
                    result = odd;
                }
                if(even.length() > result.length()){
                    result = even;
                }
            }

            return result;
        }
        public String check(String s, int start, int end){
            //start와 end를 하나씩 -- ++ 하며 범위 늘리기
            while(start>=0 && end < s.length()){
                if(s.charAt(start) == s.charAt(end)){
                    start--;
                    end++;
                }else{
                    break;
                }
            }
            //인덱스로 돌려놓기
            start++;
            end--;
            //회문 추출
            String temp = s.substring(start,end+1);
            return temp;
        }
    }
}
