package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2991 {
    public static void main(String[] args) throws IOException {
        //백준 2991 사나운 개
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int D = Integer.parseInt(s[3]);

        String[] s1 = br.readLine().split(" ");

        for (int i = 0; i < 3; i++) {
            int N  = Integer.parseInt(s1[i]);

            int dog1 = N % (A + B);
            int dog2 = N % (C + D);
            int count = 0;


            if(dog1 <= A && dog2 <= C) {
                count = 2;
            }else if(dog1 <= A || dog2 <= C) {
                count = 1;
            }

            if(dog1 == 0) {
                count -= 1;
            }
            if(dog2 == 0) {
                count -= 1;
            }

            System.out.println(count);
        }




    }
}
