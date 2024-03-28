package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2858 {
    public static void main(String[] args) throws IOException {
        //백준 2858 기숙사 바닥
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int red = Integer.parseInt(s[0]);
        int brown = Integer.parseInt(s[1]);

        for (int i = 1; i <= brown; i++) {
            if(brown % i ==0 ){
                int L = brown/i +2;
                int W = i +2;
                if((L+W)*2 -4 == red){
                    System.out.println(Math.max(L,W)+" "+Math.min(L,W));
                    break;
                }
            }
        }
    }
}
