package leetcode;

public class ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        int num;
        s="PAYPALISHIRING";
        num = 3;
        System.out.println(solution.convert(s,num));
        s="PAYPALISHIRING";
        num = 4;
        System.out.println(solution.convert(s,num));
    }
    static class Solution {
        public String convert(String s, int numRows) {
            // numRows의 크기로
            //Z형태를 그리면서 재배열한 문자열을 return


            //개수가 똑같거나 길이가 1인 경우
            if(s.length() == numRows){
                return s;
            }
            if(numRows == 1){
                return s;
            }

            //각 칸에 들어갈 문자열들
            String[] rowStr = new String[numRows];
            for(int i=0; i< numRows; i++){
                rowStr[i] = "";
            }
            
            
            String[] strs = s.split("");

            int count = 0;
            boolean plus = true;
            
            //각 문자별로 넣기 
            for(String str : strs){
                rowStr[count] += str;

                if(plus){
                    count++;
                }else{
                    count--;
                }
                if(count == numRows-1) {
                    plus = false;
                }
                if(count == 0) {
                    plus = true;
                }
            }
            String answer = "";
            for(String str : rowStr){
                answer += str;
            }


            return answer;
        }
    }
}
