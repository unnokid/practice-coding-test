package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ9443 {
    public static void main(String[] args) throws IOException {
        //백준 9443  Arrangement of Contest
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count =0;
        char target = 'A';

        char[] list = new char[N];

        for (int i = 0; i < N; i++) {
            char c = br.readLine().charAt(0);
            list[i] = c;
        }
        Arrays.sort(list);
        for (char c : list) {
            if (c == target) {
                count++;
                target = (char) (target + 1);
            }
        }

        System.out.println(count);
    }
}
