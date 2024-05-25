package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31789 {
    public static void main(String[] args) throws IOException {
        //백준 31789 모험의 시작
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int X = Integer.parseInt(s[0]);
        int S = Integer.parseInt(s[1]);

        boolean pass = false;
        for (int i = 0; i < N; i++) {
            s = br.readLine().split(" ");
            int price = Integer.parseInt(s[0]);
            int attack = Integer.parseInt(s[1]);
            if(price <= X && attack >S){
                pass = true;
                break;
            }
        }
        System.out.println(pass? "YES":"NO");


    }
}
