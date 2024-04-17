package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2979 {
    public static void main(String[] args) throws IOException {
        //백준2979 트럭 주차
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int total =0;
        int[] price = new int[4];
        for (int i = 1; i < price.length; i++) {
            price[i] = Integer.parseInt(s[i-1])*i;
        }

        int[] time = new int[101];

        for (int i = 0; i < 3; i++) {
            String[] s1 = br.readLine().split(" ");
            int start = Integer.parseInt(s1[0]);
            int end = Integer.parseInt(s1[1]);
            for (int j = start; j <end ; j++) {
                time[j]++;
            }
        }

        for (int i = 0; i <time.length ; i++) {
            total+= price[time[i]];
        }
        System.out.println(total);
    }
}
