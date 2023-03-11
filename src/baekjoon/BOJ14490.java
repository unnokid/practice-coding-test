package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14490 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(":");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int result = lcm(a,b);
        System.out.println(a/result+":"+b/result);
    }
    private static int lcm(int a, int b){
        if(b ==0){
            return a;
        }else{
            return lcm(b, a%b);
        }
    }
}
