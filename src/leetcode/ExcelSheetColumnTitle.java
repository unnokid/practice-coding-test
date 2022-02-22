package leetcode;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int s;
        s=1;
        System.out.println(solution.convertToTitle(s));
        s=28;
        System.out.println(solution.convertToTitle(s));
        s=701;
        System.out.println(solution.convertToTitle(s));
    }
    static class Solution {
        public String convertToTitle(int columnNumber) {
            //번호를 주면 엑셀 알파벳 표기로 바꾸기
            String answer ="";


            while(columnNumber>0){
                //한칸이 자꾸 밀림
                columnNumber--;
                char temp = (char) (columnNumber%26 +'A');
                answer = temp+answer;
                columnNumber/=26;
            }
            return answer;
        }
    }
}
