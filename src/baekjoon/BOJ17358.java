package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17358 {

    public static void main(String[] args) throws IOException {
        //백준 17358 복불복으로 지구 멸망

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long result =1;
        long mod = 1000000007;
        while(N>0){
            result*=N-1;
            result%=mod;
            N-=2;
        }
        System.out.println(result);

    }
}
