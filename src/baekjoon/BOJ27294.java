package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27294 {
    public static void main(String[] args) throws IOException {
        //백준 27294 몇개고?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int T = Integer.parseInt(s[0]);
        int S = Integer.parseInt(s[1]);

        if(S == 1 || T<=11 || T >16){
            System.out.println(280);
        }else if(T>=12 && T<=16 && S ==0){
            System.out.println(320);
        }
    }
}
