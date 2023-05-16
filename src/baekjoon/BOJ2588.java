package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
        //백준 2588 곱셉

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int result = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int target = B%10;
            int sum = A*target;
            sb.append(sum).append("\n");
            result+=(sum*Math.pow(10,i));
            B/=10;
        }
        sb.append(result);
        System.out.println(sb);

    }
}
