package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10768 {
    public static void main(String[] args) throws IOException {
        //백준 10768 특별한 날
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());


        if(M>2){
            System.out.println("After");
        }else if(M ==2){
            if(D>18){
                System.out.println("After");
            }else if(D ==18){
                System.out.println("Special");
            }else {
                System.out.println("Before");
            }
        }else{
            System.out.println("Before");
        }
    }
}
