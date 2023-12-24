package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25238 {
    public static void main(String[] args) throws IOException {
        //백준 25238 가희와 방어율 무시
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        double result = a-a*((double)b/100);

        if(result >= 100){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
