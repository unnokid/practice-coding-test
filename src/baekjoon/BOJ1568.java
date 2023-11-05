package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1568 {
    public static void main(String[] args) throws IOException {
        //백준 1568 새
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int time =0 ;

        while(N>0){
            if(N<count){
                count = 1;
            }
            N-= count;

            count++;
            time++;
        }
        System.out.println(time);
    }
}
