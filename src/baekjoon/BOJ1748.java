package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1748 {

    public static void main(String[] args) throws IOException {
        //백준 1748 수 이어 쓰기1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        long result = 0;

        int count = 1;
        int line = 10;
        for (int i = 1; i <=N ; i++) {
            if(i%line ==0){
                count++;
                line*=10;
            }
            result+=count;
        }
        System.out.println(result);
    }
}
