package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23795 {
    public static void main(String[] args) throws IOException {
        //백준 23795 사장님 도박은 재미로 하셔야 합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum =0;
        while (true){
            int N = Integer.parseInt(br.readLine());

            if(N == -1){
                break;
            }
            sum+=N;
        }
        System.out.println(sum);
    }
}
