package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14489 {
    public static void main(String[] args) throws IOException {
        //백준 14489 치킨 두마리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long price = Long.parseLong(br.readLine());

        long A= Long.parseLong(s[0]);
        long B= Long.parseLong(s[1]);

        long sum = A+B;

        if(sum >= price*2){
            sum-= (price*2);
        }

        System.out.println(sum);
    }
}
