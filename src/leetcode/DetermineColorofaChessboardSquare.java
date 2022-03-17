package leetcode;

public class DetermineColorofaChessboardSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String coordi;
        coordi = "a1";
        System.out.println(solution.squareIsWhite(coordi));
        coordi = "h3";
        System.out.println(solution.squareIsWhite(coordi));
    }
    static class Solution {
        public boolean squareIsWhite(String coordinates) {
            //a~h , 1~8 짜리 체스판에서
            //좌표를 줄때 흰색이면 true, 검은색이면 false
            int sum =0;
            char[] temp = coordinates.toCharArray();
            int f = temp[0] - 'a'+1;
            int b = temp[1] - '0';

            return (f+b)%2==1;

        }
    }
}
