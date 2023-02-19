package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ20364 {

    static int answer;
    static boolean[] lands;

    public static void main(String[] args) throws IOException {
        //백준 20364 부동산 다툼

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int Q = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();
        lands = new boolean[N + 1];

        for (int i = 0; i < Q; i++) {
            int target = Integer.parseInt(br.readLine());
            answer = 0;
            findLand(target);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    private static void findLand(int target) {
        int n = target;
        while (n > 0) {
            if (lands[n]) {
                answer = n;
            }
            n /= 2;
        }

        if (answer == 0) {
            lands[target] = true;
        }

    }
}
