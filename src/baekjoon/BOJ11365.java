package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11365 {
    public static void main(String[] args) throws IOException {
        //백준 11365 !밀비 금일
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String N  = br.readLine();
            if(N.equals("END")){
                break;
            }
            StringBuilder temp = new StringBuilder(N);
            sb.append(temp.reverse()).append("\n");
        }
        System.out.println(sb);
    }
}
