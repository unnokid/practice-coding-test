package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5358 {
    public static void main(String[] args) throws IOException {
        //백준 5358 Football Team
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String s = null;
        while((s = br.readLine()) != null){
            for (int i = 0; i <s.length() ; i++) {
                char ch = s.charAt(i);
                if(ch == 'e'){
                    sb.append("i");
                }else if(ch == 'i'){
                    sb.append("e");
                }else if(ch == 'E'){
                    sb.append("I");
                }else if(ch == 'I'){
                    sb.append("E");
                }else{
                    sb.append(ch);
                }

            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
