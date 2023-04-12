package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        //백준 2562 최댓값

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int idx =-1;
        for (int i = 0; i < 9; i++) {
            int target = Integer.parseInt(br.readLine());
            if(target> max){
                max = target;
                idx =i+1;
            }
        }

        System.out.println(max);
        System.out.println(idx);

    }
}
