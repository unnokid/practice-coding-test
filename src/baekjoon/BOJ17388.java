package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17388 {
    public static void main(String[] args) throws IOException {
        //백준 17388 와글와글 숭고한
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int s = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        int h = Integer.parseInt(split[2]);

        if(s+k+h >= 100){
            System.out.println("OK");
        }else{
            int target = Math.min(s, Math.min(k,h));
            if(target == s){
                System.out.println("Soongsil");
            }else if(target == k){
                System.out.println("Korea");
            }else{
                System.out.println("Hanyang");
            }
        }
    }
}
