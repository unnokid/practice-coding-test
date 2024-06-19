package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4388 {
    public static void main(String[] args) throws IOException {
        //백준 4388 받아올림
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);

            //둘다 0
            if (A + B == 0){
                break;
            }

            int count = 0;
            int plus = 0;
            while (A != 0 || B != 0) {
                int nextA = A % 10;
                int nextB = B % 10;
                
                A /= 10;
                B /= 10;
                
                if (nextA + nextB + plus >= 10) {
                    count++;
                    plus = 1; //한자리 올림
                } else{
                    plus = 0;
                }
            }
            System.out.println(count);
        }


    }
}
