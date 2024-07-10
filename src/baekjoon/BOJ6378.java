package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6378 {
    public static void main(String[] args) throws IOException {
        //백준 6378 디지털 루트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("0")){
                break;
            }
            int sum =0;
            while(s.length() >1){

                for (int i = 0; i <s.length() ; i++) {
                    int next = Integer.parseInt(s.substring(i,i+1));
                    sum +=next;
                }

                s = String.valueOf(sum);
                if(sum >= 10){
                    sum =0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
