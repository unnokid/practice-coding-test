package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28113 {
    public static void main(String[] args) throws IOException {
        //백준 28113 정보섬의 대중교통
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int A = Integer.parseInt(s[1]);
        int B = Integer.parseInt(s[2]);

        if(B>A){
            System.out.println("Bus");
        }else if(B <A){
            System.out.println("Subway");
        }else{
            System.out.println("Anything");
        }
    }
}
