package Programmers.level3;

import java.util.Arrays;

public class Immigration {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[] times;
        n=6;
        times = new int[]{7,10};
        System.out.println(solution.solution(n,times));
        n=10;
        times = new int[]{6,8,10};
        System.out.println(solution.solution(n,times));
        n=3;
        times = new int[]{1000000000,1000000000,1000000000};
        System.out.println(solution.solution(n,times));
        n=3;
        times = new int[]{1,1,1};
        System.out.println(solution.solution(n,times));
        n=3;
        times = new int[]{1,2,3};
        System.out.println(solution.solution(n,times));
        n=6;
        times = new int[]{7,7,7,7,7,8,8,8,8,8};
        System.out.println(solution.solution(n,times));
    }
    static class Solution {
        public long solution(int n, int[] times) {
            //n명이 입국심사를 위해 기다림
            //times배열에 각 심사관마다 걸리는 시간
            //처음에는 모두 비어있고 동시에 한명씩만 심사 가능
            //모든 사람이 심사받는데 걸리는 시간 최솟값 return

            //배열 정렬
            Arrays.sort(times);
            long answer = 0;
            long start =0;
            long end = (long) n * times[times.length-1];//제일오래걸리는 시간 * n

            while (start <= end){
                //중간값
                long time = (start +end)/2;
                long count =0;//인원
                for (int i = 0; i < times.length; i++) {
                    count += time/times[i];
                    //만약 더이상 나눠지지않으면 끝
                    if(time/times[i] <= 0){
                        break;
                    }
                }
                System.out.println("count:"+count);
                if(count < n){
                    //time이 더 필요함
                    start= time + 1;
                }else{
                    //time이 더 줄여야함
                    end = time -1;
                    //count는 만족하지만 또 돌려봐야됨
                    answer = time;
                }
            }

            return answer;
        }
    }
}
