package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        //백준 9506 약수들의 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int sum =1;
        while(true){
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            sum=1;
            if(N == -1){
                break;
            }
            sb.append(N).append(" = 1");
            for (int i = 2; i <N ; i++) {
                if(N%i ==0){
                    sum+=i;
                    sb.append(" + ").append(i);
                }
            }
            if(sum == N){
                result.append(sb).append("\n");
            }else{
                result.append(N).append(" is NOT perfect.").append("\n");
            }
        }
        System.out.println(result);


    }
}
