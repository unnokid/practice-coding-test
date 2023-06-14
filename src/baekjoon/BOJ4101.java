package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4101 {
    public static void main(String[] args) throws IOException {
        //백준 4101 크냐?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true){
            String[] s = br.readLine().split(" ");
            int first = Integer.parseInt(s[0]);
            int second = Integer.parseInt(s[1]);

            if(first ==0 && second ==0){
                break;
            }
            if(first > second){
                sb.append("Yes").append("\n");
            }else{
                sb.append("No").append("\n");
            }

        }
        System.out.println(sb);
    }
}
