package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14582 {
    public static void main(String[] args) throws IOException {
        //백준 14582 오늘도 졌다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int[] geminis = new int[10];
        int[] startLink = new int[10];
        boolean win = false;
        String result= "No";
        int G =0;
        int S =0;
        for (int i = 0; i < s1.length; i++) {
            geminis[i] = Integer.parseInt(s1[i]);
            startLink[i] = Integer.parseInt(s2[i]);
        }

        for (int i = 0; i < geminis.length; i++) {
            G+=geminis[i];
            if(G>S){
                win = true;
            }else if(G < S && win){
                result = "Yes";
            }
            S+=startLink[i];
        }
        System.out.println(result);
    }
}
