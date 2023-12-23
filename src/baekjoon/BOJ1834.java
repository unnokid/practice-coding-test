package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1834 {
    public static void main(String[] args) throws IOException {
        //백준 1834 나머지와 몫이 같은 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long result =0;

        //나머지와 몫 매치
        for (int i = 0; i <N ; i++) {
            result+= (N +1)*i;
        }
        System.out.println(result);
    }
}
