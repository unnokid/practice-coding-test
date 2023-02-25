package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {

    public static void main(String[] args) throws IOException {
        //백준 2577 숫자의 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A B C는 100보다 크고 1000보다 작음
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int[] count = new int[10];

        int total = A*B*C;

        while(total > 0){
            int target = total%10;
            count[target]++;
            total/=10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <count.length ; i++) {
            sb.append(count[i]).append("\n");
        }
        System.out.println(sb);
    }
}
