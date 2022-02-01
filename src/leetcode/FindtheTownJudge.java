package leetcode;

import java.util.Arrays;

public class FindtheTownJudge {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[][] trust;/*
        n=3;
        trust = new int[][]{{1,3},{2,3}};
        System.out.println(solution.findJudge(n,trust));*/
        n=4;
        trust = new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}};
        System.out.println(solution.findJudge(n,trust));
    }
    static class Solution {
        public int findJudge(int n, int[][] trust) {
            
            //n명중 판사가 1명이 있음
            //판사가 되기위해 조건이있음
            //판사는 아무도안믿음
            //판사를 제외한 모든사람은 판사를 믿음
            //이 조건을 만족하는 사람이 딱 1명이 있음
            //사람을 믿는 배열이 주어질때 판사는 몇번째인가

            //사람이 한명이면 그냥 그 사람이 판사
            if(n == 1){
                return 1;
            }

            int count = -1;
            int[] map = new int[n+1];

            //믿음을 받는 사람 인덱스 ++
            for (int i = 0; i < trust.length ; i++) {
               map[trust[i][1]]++;

               //모두의 신뢰를 받는 카운트를 넘어서면 count에 그 번호넣기
               if(map[trust[i][1]] >= n-1){
                    count = trust[i][1];
                    break;
               }
            }

            //판사는 믿지않기때문에 믿으면 -1
            for (int i = 0; i < trust.length; i++) {
                if(trust[i][0] == count){
                    count =-1;
                    break;
                }
            }

            return count;
        }
    }
}
