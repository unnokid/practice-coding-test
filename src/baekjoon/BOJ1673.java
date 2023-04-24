package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1673 {
    public static void main(String[] args) throws IOException {
        //백준 1673 치킨 쿠폰

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String target = br.readLine();

            if (target == null) {
                break;
            }
            int total = 0;
            String[] split = target.split(" ");
            int N = Integer.parseInt(split[0]);
            int K = Integer.parseInt(split[1]);

            //계산
            total = check(N,0,K);

            System.out.println(total);
        }

    }

    private static int check(int n, int count, int k) {
        if (n < k) {
            //쿠폰으로 못바꿈
            return count + n;
        }
        return check((n / k) + (n % k), count + (n - (n % k)), k);
    }

}
