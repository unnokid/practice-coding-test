package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1292 {
    public static void main(String[] args) throws IOException {
        //백준 1292 쉽게 푸는 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        int count =0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=1000 ; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
                count++;
            }
            if(B < count){
                break;
            }
        }
        int sum =0;
        for (int i = A-1; i <=B-1 ; i++) {
            sum +=list.get(i);
        }
        System.out.println(sum);
    }
}
