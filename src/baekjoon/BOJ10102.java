package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10102 {
    public static void main(String[] args) throws IOException {
        //백준 10102 개표
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int A = 0;
        int B = 0;
        String[] split = br.readLine().split("");
        for (int i = 0; i < N; i++) {
            if(split[i].equals("A")){
                A++;
            }else{
                B++;
            }
        }

        if(A==B){
            System.out.println("Tie");
        }else{
            System.out.println(A>B?"A":"B");
        }

    }
}
