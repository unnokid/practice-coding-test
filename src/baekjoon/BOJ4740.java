package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4740 {
    public static void main(String[] args) throws IOException {
        //백준 4740 거울, 오! 거울
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String s= br.readLine();
            if(s.equals("***")){
                break;
            }
            StringBuilder temp = new StringBuilder();
            temp.append(s);
            sb.append(temp.reverse()).append("\n");
        }
        System.out.println(sb);
    }
}
