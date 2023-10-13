package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5341 {
    public static void main(String[] args) throws IOException {
        //백준 5341 Pyramids
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int T = Integer.parseInt(br.readLine());
            if(T ==0){
                break;
            }
            int sum =0;
            for (int i = 1; i <=T ; i++) {
                sum+=i;
            }
            System.out.println(sum);
        }

    }
}
