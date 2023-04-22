package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2566 {
    public static void main(String[] args) throws IOException {
        //백준 2566 최댓값

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x= 0;
        int y =0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int target = Integer.parseInt(split[j]);
                if(target > max){
                    x= i;
                    y =j;
                    max = target;
                }
            }
        }
        System.out.println(max);
        System.out.println((x+1)+" "+(y+1));
    }
}
