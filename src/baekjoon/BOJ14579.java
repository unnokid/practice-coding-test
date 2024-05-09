package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14579 {
    public static void main(String[] args) throws IOException {
        //백준 14579 덧셈과 곱셉
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");


        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int result = 1;

        for (int i = 0; i < b; i++) {
            if(a>b){
                break;
            }
            double sum =0;
            for (int j = 1; j <=a ; j++) {
                sum+=j;
            }
            a++;
            result*= (int) sum;
            result%=14579;
        }

        System.out.println(result);


    }
}
