package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ15726 {
    public static void main(String[] args) throws IOException {
        //백준 15726 이칙연산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        double[] arr = new double[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(s[i]);
        }
        if(((arr[0] * arr[1]) / arr[2]) > ((arr[0] / arr[1]) * arr[2])) {
            System.out.println((int) ((arr[0] * arr[1]) / arr[2]));
        }else {
            System.out.println((int) ((arr[0] / arr[1]) * arr[2]));
        }
    }
}
