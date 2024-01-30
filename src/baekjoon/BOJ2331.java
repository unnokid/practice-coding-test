package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2331 {
    public static void main(String[] args) throws IOException {
        //백준 2331 반복수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int P = Integer.parseInt(s[1]);

        List<Integer> list = new ArrayList<>();
        list.add(A);

        while (true) {
            int temp = list.get(list.size() - 1);

            int target = 0;
            while (temp != 0) {
                target += (int) Math.pow(temp % 10, (double) P);
                temp /= 10;
            }

            if (list.contains(target)) {
                int result = list.indexOf(target);
                System.out.println(result);
                break;
            }

            list.add(target);
        }

    }
}
