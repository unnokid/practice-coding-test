package leetcode;

import java.util.Arrays;

public class DivisorGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=2;
        System.out.println(solution.divisorGame(n));
        n=3;
        System.out.println(solution.divisorGame(n));
        n=4;
        System.out.println(solution.divisorGame(n));
        n=5;
        System.out.println(solution.divisorGame(n));
    }
    static class Solution {
        public boolean divisorGame(int n) {
            //Alice와 Bob이 턴제 게임
            //alice가 먼저 시작

            //각턴마다 x를 선택가능함 0<x<n 그리고 n%x==0을 만족하는 x
            //n을 바꾼다 n-x로
            //만약 바꿀수가 없다면 게임에서 진다


            //순서가 x가 true면 n-x는 false가 되어야 게임끝
            boolean map[] = new boolean[n+1];
            //0은 안씀
            //1은 무조건 실패
            map[0] = false;
            map[1] = false;
            for (int i = 2; i <=n ; i++) {
                for (int j = 1; j <i ; j++) {
                    if((i%j ==0) && !map[i-j]){
                        map[i]=true;
                        break;
                    }
                }
            }

            return map[n];
        }
    }
}
