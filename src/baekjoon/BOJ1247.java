package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1247 {
    public static void main(String[] args) throws IOException {
        //백준 1247 부호

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i <3 ; i++) {
            int N = Integer.parseInt(br.readLine());

            BigInteger S = new BigInteger("0");

            for (int j = 0; j < N; j++) {
                BigInteger S2 = new BigInteger(br.readLine());
                S =S.add(S2);
            }

            if(S.compareTo(BigInteger.ZERO) < 0){
                System.out.println("-");
            }else if(S.compareTo(BigInteger.ZERO) > 0){
                System.out.println("+");
            }else{
                System.out.println(0);
            }
        }
    }
}
