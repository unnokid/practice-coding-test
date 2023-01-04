package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1049 {

    public static void main(String[] args) throws IOException {
        //백준 1049 기타줄

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int result = 0;
        int minOne = 10000;
        int minSet = 10000;

        for (int i = 0; i < M; i++) {
            String[] brand = br.readLine().split(" ");
            minOne = Math.min(Integer.parseInt(brand[1]),minOne);
            minSet = Math.min(Integer.parseInt(brand[0]),minSet);
        }

        if(minSet >= minOne *6){
            //한개씩
            result = minOne *N;
        }else{
            if(N%6 != 0) {
                result = Math.min(minSet * (N/6) + (N%6) * minOne, minSet * ((N/6) + 1));
            } else {
                // 6개 묶음
                result = minSet * (N/6);
            }
        }

        System.out.println(result);
    }

}
