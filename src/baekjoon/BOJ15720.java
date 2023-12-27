package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ15720 {
    public static void main(String[] args) throws IOException {
        //백준 15720 카우버거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int[] burger = new int[Integer.parseInt(s[0])];
        int[] side = new int[Integer.parseInt(s[1])];
        int[] drink = new int[Integer.parseInt(s[2])];

        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        String[] s3 = br.readLine().split(" ");
        int sum =0;
        int discount =0;
        for (int i = 0; i < burger.length; i++) {
            burger[i] = Integer.parseInt(s1[i]);
            sum+=burger[i];
        }

        for (int i = 0; i < side.length; i++) {
            side[i] = Integer.parseInt(s2[i]);
            sum+=side[i];
        }

        for (int i = 0; i < drink.length; i++) {
            drink[i] = Integer.parseInt(s3[i]);
            sum+=drink[i];
        }

        Arrays.sort(burger);
        Arrays.sort(side);
        Arrays.sort(drink);
        int len = Math.min(burger.length,Math.min(side.length,drink.length));
        for (int i = 0; i < len; i++) {
            discount += (burger[burger.length-1-i]+side[side.length-1-i]+drink[drink.length-1-i])*0.9;
        }

        for (int i = len; i < burger.length; i++) {
            discount += burger[burger.length-1-i];
        }
        for (int i = len; i < side.length; i++) {
            discount += side[side.length-1-i];
        }
        for (int i = len; i < drink.length; i++) {
            discount += drink[drink.length-1-i];
        }

        System.out.println(sum);
        System.out.println(discount);
    }
}
