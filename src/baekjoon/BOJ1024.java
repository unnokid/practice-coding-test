package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1024 {
    public static void main(String[] args) throws IOException {
        //백준 1024 수열의 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int L = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();


        while(true){
            //현재 연속된 수열의 제일 중심을 구하고 원하는 길이만큼 빼줌
            int min = N/L - ((L-1)/2);
            if(min <0 || L >100){
                sb.append(-1);
                break;
            }

            int sum = (min*2 + L-1)*L/2;
            //구한 수열의 합 계산
            if(sum == N){
                for (int i = 0; i <L ; i++) {
                    sb.append(min+i).append(" ");
                }
                break;
            }

            L++;
        }

        System.out.println(sb);
    }
}
