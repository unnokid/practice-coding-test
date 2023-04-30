package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class BOJ2545 {
    public static void main(String[] args) throws IOException {
        //백준 2545 팬케익 먹기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[3];
        for (int i = 0; i < N; i++) {
            br.readLine();
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                arr[j] = Long.parseLong(s[j]);
            }
            Arrays.sort(arr);
            long d = Long.parseLong(s[3]);
            //결국 d를 빼면서 모든 변이 같게 만들어야하고
            //큰 변에서부터 -1 시작
            long limit = arr[0] + arr[1] + arr[2] - d;
            long value = Math.min(limit/3,arr[0]);
            long a1 = value;
            limit -= value;
            value = Math.min(limit/2,arr[1]);

            BigInteger one = new BigInteger(String.valueOf(a1));
            BigInteger two = new BigInteger(String.valueOf(value));
            BigInteger third = new BigInteger(String.valueOf((limit-value)));

            System.out.println(one.multiply(third).multiply(two));
        }
    }
}
