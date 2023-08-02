package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ19944 {
    public static void main(String[] args) throws IOException {
        //백준 19944 뉴비의 기준은 뭘까?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        if(A<B){
            System.out.println("TLE!");
        }else if(B<=2){
            System.out.println("NEWBIE!");
        }else{
            System.out.println("OLDBIE!");
        }
    }
}
