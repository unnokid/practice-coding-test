package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17284 {
    public static void main(String[] args) throws IOException {
        //백준 17284 Vending Machine
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[]{500,800,1000};
        int money = 5000;
        for (int i = 0; i < s.length; i++) {
            int choice = Integer.parseInt(s[i]) -1;
            money-= arr[choice];
        }
        System.out.println(money);
    }
}
