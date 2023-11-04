package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5532 {
    public static void main(String[] args) throws IOException {
        //백준 5532 방학 숙제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int korea = 0;
        int math =0;
        if(A%C ==0){
            korea = A/C;
        }else{
            korea = (A/C)+1;
        }

        if(B%D ==0){
            math = B/D;
        }else{
            math = (B/D)+1;
        }
        L-= Math.max(korea,math);
        System.out.println(L);
    }
}
