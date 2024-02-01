package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4880 {
    public static void main(String[] args) throws IOException {
        //백준 4880 다음수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true){
            String[] s = br.readLine().split(" ");
            int a= Integer.parseInt(s[0]);
            int b= Integer.parseInt(s[1]);
            int c= Integer.parseInt(s[2]);
            int result =0;

            if(a ==0 && b==0 &&c ==0){
                break;
            }

            if(b-a == c - b){
                result = c + (c-b);
                sb.append("AP ").append(result).append("\n");
            }else{
                result = c*(c/b);
                sb.append("GP ").append(result).append("\n");
            }
        }
        System.out.println(sb);

    }
}
