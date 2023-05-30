package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2506 {
    public static void main(String[] args) throws IOException {
        //백준 2506 점수 계산

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result =0;
        String[] s = br.readLine().split(" ");
        int plus =0;
        for (int i = 0; i <N ; i++) {
            int target = Integer.parseInt(s[i]);
            if(target == 1){
                plus++;
            }else{
                plus =0;
            }

            result+=plus;
        }

        System.out.println(result);
    }
}
