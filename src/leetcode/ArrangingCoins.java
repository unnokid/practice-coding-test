package leetcode;

public class ArrangingCoins {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=5;
        System.out.println(solution.arrangeCoins(n));
        n=8;
        System.out.println(solution.arrangeCoins(n));
        n=7;
        System.out.println(solution.arrangeCoins(n));
    }
    static class Solution {
        public int arrangeCoins(int n) {

            //계단모양에 코인을 채워넣을 수 있음
            //세로로 몇칸까지 채울수 있는지 return
            int stair = 1;
            int coin =1;
            //stair로 채워야할 코인개수 늘리기
            while( n- coin >=0){
                stair++;
                coin+=stair;
            }
            return stair-1;

        }
    }
}
