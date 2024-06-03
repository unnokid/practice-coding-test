package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31833 {
    public static void main(String[] args) throws IOException {
        //백준 31833 온데간데없을뿐더러
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder numA = new StringBuilder();
        StringBuilder numB = new StringBuilder();

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        for (int j = 0; j <N; j++) {
            numA.append(A[j]);
            numB.append(B[j]);
        }

        long nextA = Long.parseLong(numA.toString());
        long nextB = Long.parseLong(numB.toString());
        System.out.println(Math.min(nextA,nextB));





    }
}
