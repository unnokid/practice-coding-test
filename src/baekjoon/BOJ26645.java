package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ26645 {
    public static void main(String[] args) throws IOException {
        //백준 26645 성장의 비약 선택권
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        System.out.println(checkNumber(N));
    }
    public static int checkNumber(int level){
        int result =0;

        if(level <=205){
            return 1;
        }else if(level <=217){
            return 2;
        }else if(level <=228){
            return 3;
        }else {
            return 4;
        }
    }
}
