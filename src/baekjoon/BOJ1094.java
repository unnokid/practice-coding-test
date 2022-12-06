package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1094 {

    public static void main(String[] args) throws IOException {
        //백준 1094 막대기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int stick = 64;
        int count =0 ;
        while(N>0){
            if(stick > N){
                stick/=2;
            }else{
                //막대 붙이기
                count++;
                N-=stick;
            }
        }

        System.out.println(count);
    }
}
