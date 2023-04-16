package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5565 {
    public static void main(String[] args) throws IOException {
        //백준 5565 영수증

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i <9 ; i++) {
            int price= Integer.parseInt(br.readLine());
            sum+=price;
        }

        System.out.println(N-sum);
    }

}
