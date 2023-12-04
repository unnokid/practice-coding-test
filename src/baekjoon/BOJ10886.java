package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10886 {
    public static void main(String[] args) throws IOException {
        //백준 10886 0 = not cute / 1 = cute
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[2];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        String result = arr[0] > arr[1] ? "Junhee is not cute!": "Junhee is cute!";
        System.out.println(result);
    }
}
