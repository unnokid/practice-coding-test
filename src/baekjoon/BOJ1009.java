package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1009 {

    public static void main(String[] args) throws IOException {
        //백준 1009 분산처리

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i <T ; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int target = 1;

            for (int j = 0; j < b; j++) {
                target = (target*a)%10;
            }
            if(target ==0){
                target = 10;
            }
            System.out.println(target);
        }
    }
}
