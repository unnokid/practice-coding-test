package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2240 {
    public static void main(String[] args) throws IOException {
        //백준 2240 자두

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int T = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);


        //t초에 w 움직였을때 얻을수있는 값
        int[][] dp = new int[T+1][W+1];

        for (int i = 1; i <=T ; i++) {
            //i는 지나가는 시간

            //자두가 떨어지는 위치
            int target = Integer.parseInt(br.readLine());

            //움직이는 횟수
            for (int j = 0; j <=W ; j++) {

                //처음 시작, 움직인 적이 없음
                if(j ==0){
                    //맨처음 초기값
                    if(target ==1){
                        dp[i][j] = dp[i-1][j] +1;
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                    continue;
                }


                //여러번 움직인 이후 시점
                //움직임 횟수가 짝수면 1번나무, 홀수면 2번나무
                //움직이지않고 전 시간이 큰지 or 현재 위치의 움직임이 큰지
                if(j%2==0){
                    //1번 나무
                    if(target ==1){
                        dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j] +1);
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j-1]+1,dp[i-1][j]);
                    }
                }else{
                    //2번 나무
                    if(target ==1){
                        dp[i][j] = Math.max(dp[i-1][j-1]+1,dp[i-1][j]);
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j]+1);
                    }
                }
            }
        }

        int result =0;
        //t 초까지 진행했을때 큰값
        for (int i = 0; i <=W ; i++) {
            result = Math.max(result,dp[T][i]);
        }

        System.out.println(result);

    }
}
