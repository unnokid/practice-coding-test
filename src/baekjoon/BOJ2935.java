package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ2935 {
    public static void main(String[] args) throws IOException {
        //백준 2935 소음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        String target = br.readLine();
        BigInteger b = new BigInteger(br.readLine());

        if(target.equals("*")){
            System.out.println(a.multiply(b));
        }else{
            System.out.println(a.add(b));
        }

    }
}
