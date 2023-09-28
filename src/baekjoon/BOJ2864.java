package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2864 {
    public static void main(String[] args) throws IOException {
        //백준 2864 5와 6의 차이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        String A = s[0];
        String B = s[1];

        StringBuilder maxA = new StringBuilder();
        StringBuilder maxB = new StringBuilder();
        StringBuilder minA = new StringBuilder();
        StringBuilder minB = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '5' || A.charAt(i) == '6') {
                minA.append("5");
                maxA.append("6");
            } else {
                minA.append(A.charAt(i));
                maxA.append(A.charAt(i));
            }
        }
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '5' || B.charAt(i) == '6') {
                minB.append("5");
                maxB.append("6");
            } else {
                minB.append(B.charAt(i));
                maxB.append(B.charAt(i));
            }
        }
        int min = Integer.parseInt(minA.toString()) + Integer.parseInt(minB.toString());
        int max = Integer.parseInt(maxA.toString()) + Integer.parseInt(maxB.toString());
        System.out.print(min + " " + max);
    }
}
