package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        //백준 2292 벌집
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count =1;
        int len = 2;

        if(N == 1){
            System.out.println(1);
        }else{

            while(len <=N){
                len = len +(count*6);
                count++;
            }
            System.out.println(count);
        }
    }
}
