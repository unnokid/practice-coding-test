package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1712 {
    public static void main(String[] args) throws IOException {
        //백준 1712 손익분기점
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int C = Integer.parseInt(split[2]);

        if(B >= C){
            System.out.println(-1);

        }else{
            System.out.println(A/(C-B)+1);
        }


    }
}
