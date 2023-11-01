package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2386 {
    public static void main(String[] args) throws IOException {
        //백준 2386 도비의 영어 공부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true){
            int count =0;
            String s = br.readLine();
            char target = s.charAt(0);
            if( target== '#'){
                break;
            }
            s = s.substring(1).toLowerCase();


            for (int i = 0; i <s.length() ; i++) {
                char ch = s.charAt(i);
                if(ch == target){
                    count++;
                }
            }
            sb.append(target).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}
