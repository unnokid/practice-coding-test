package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30468 {
    public static void main(String[] args) throws IOException {
        //백준 30468 호반우가 학교에 지각한 이유 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int STR = Integer.parseInt(s[0]);
        int DEX = Integer.parseInt(s[1]);
        int INT = Integer.parseInt(s[2]);
        int LUK = Integer.parseInt(s[3]);
        int N = Integer.parseInt(s[4]);

        if(STR+DEX+INT+LUK >= 4*N){
            System.out.println(0);
        }else{
            System.out.println(4*N-(STR+DEX+INT+LUK));
        }
    }
}
