package leetcode;

public class NimGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=4;
        System.out.println(solution.canWinNim(n));
    }
    static class Solution {
        public boolean canWinNim(int n) {
            //Nim game
            //돌무더기 치우기
            //본인이 처음 시작
            // 번갈아가며 1~3개의 돌을 제거함
            //마지막 돌을 제거하는 사람이 이김
            //n개의 돌이 주어질 때
            //게임에서 이길 수 있으면 true
            //아니면 false

            if(n<=3){
                return true;
            }
            //4면 짐 5개 이김 6개 이김 7개 이김 8개
            //4의 배수면 무조건 지는게임
            return !(n%4==0);
        }
    }
}
