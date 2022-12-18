package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1789 {
    public static void main(String[] args) throws IOException {
        //백준 1789 수들의 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long total =0;
        int count =0;
        for (int i = 1; ; i++) {
            if(total > N){
                break;
            }
            total+=i;
            count++;
        }
        System.out.println(count-1);
    }
}
