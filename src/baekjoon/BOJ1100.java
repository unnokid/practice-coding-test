package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1100 {

    public static void main(String[] args) throws IOException {
        //백준 1100 하얀 칸

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count =0;
        for (int i = 0; i < 8; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j <split.length ; j++) {
                if((i+j) %2 ==0 && split[j].equals("F") ){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
