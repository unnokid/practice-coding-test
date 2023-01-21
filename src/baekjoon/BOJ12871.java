package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ12871 {

    public static void main(String[] args) throws IOException {
        //백준 12871 무한 문자열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int slen = s.length();
        int tlen = t.length();

        if(slen == tlen) {
            if(s.equals(t)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }

        int lcm = lcm(slen, tlen);

        StringBuilder ss = new StringBuilder(s);
        StringBuilder tt = new StringBuilder(t);

        for(int i = 0 ; i < lcm / slen - 1 ; ++i) {
            ss.append(s);
        }

        for(int i = 0 ; i < lcm / tlen - 1 ; ++i) {
            tt.append(t);
        }

        if(ss.toString().equals(tt.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    private static int gcd(int a, int b) {
        while(b >0){
            int temp = a;
            a = b;
            b= temp%b;
        }

        return a;
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
