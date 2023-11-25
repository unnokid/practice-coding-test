package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17009 {
    public static void main(String[] args) throws IOException {
        //백준 17009 Winning Score

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A =0;
        int B =0;
        for (int i = 3; i >0 ; i--) {
            int score = Integer.parseInt(br.readLine());
            A+=score*i;
        }
        for (int i = 3; i >0 ; i--) {
            int score = Integer.parseInt(br.readLine());
            B+=score*i;
        }

        if(A>B){
            System.out.println("A");
        }else if(A <B){
            System.out.println("B");
        }else{
            System.out.println("T");
        }
    }

}
