package leetcode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="A";
        System.out.println(solution.titleToNumber(s));
        s="AB";
        System.out.println(solution.titleToNumber(s));
        s="ZY";
        System.out.println(solution.titleToNumber(s));
    }
    static class Solution {
        public int titleToNumber(String columnTitle) {
            int len = columnTitle.length();
            int answer =0;
            int plus= 1;
            for (int i = len -1; i >=0 ; i--) {
                //A~Z를 1~26값으로 바꾸기
                //자리가 올라갈수록 26 곱해주기
                answer +=(columnTitle.charAt(i)-64)*plus;
                plus*=26;
            }
            return answer;
        }
    }
}
