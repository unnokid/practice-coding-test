package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        //백준 1003 피보나치 함수

        int[] zero = new int[41];
        int[] one = new int[41];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <N ; i++) {
            int target = Integer.parseInt(br.readLine());
            zero[0] = 1;
            zero[1] = 0;
            one[0] =0;
            one[1] =1;

            for (int j = 2; j <=target ; j++) {
                zero[j] = zero[j-1] + zero[j-2];
                one[j] = one[j-1] + one[j-2];
            }
            System.out.println(zero[target]+" "+one[target]);
        }
    }
}
