package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13241 {
    public static void main(String[] args) throws IOException {
        //백준 13241 최소 공배수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long A = Long.parseLong(s[0]);
        long B = Long.parseLong(s[1]);

        long gcd = check(Math.max(A,B),Math.min(A,B));
        System.out.println((A*B)/gcd);
    }
    static long check(long a, long b){
        while(b >0){
            long temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
}
