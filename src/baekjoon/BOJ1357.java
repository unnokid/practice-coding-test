package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1357 {

    public static void main(String[] args) throws IOException {
        //백준 1357 뒤집힌 덧셈

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int x = Rev(Integer.parseInt(split[0]));
        int y = Rev(Integer.parseInt(split[1]));

        System.out.println(Rev(x+y));
    }
    static int Rev(int number){
        StringBuilder sb = new StringBuilder();
        while(number>0){
            sb.append(number%10);
            number/=10;
        }
        return Integer.parseInt(sb.toString());
    }
}
