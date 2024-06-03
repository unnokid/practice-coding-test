package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31798 {
    public static void main(String[] args) throws IOException {
        //백준 31798 단원평가

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int result = (int) (Math.pow(c,2) - (a+b));
        if(c ==0){
            result = (int) Math.sqrt(Math.abs(result));
            System.out.println(result);
        }else{
            System.out.println(result);
        }


    }
}
