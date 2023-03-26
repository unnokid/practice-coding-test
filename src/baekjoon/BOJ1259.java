package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        //백준 1259 팰린드롬수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int N = Integer.parseInt(br.readLine());

            if(N==0){
                break;
            }
            StringBuilder sb = new StringBuilder();
            int reverseNumber = Integer.parseInt(String.valueOf(sb.append(N).reverse()));

            if(N == reverseNumber){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

    }
}
