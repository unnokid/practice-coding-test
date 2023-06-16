package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1264 {
    public static void main(String[] args) throws IOException {
        //백준 1264 모음의 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine().toLowerCase();
            int count =0;
            if(s.equals("#")){
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(c == 'a' || c =='e'|| c== 'i' || c=='o' || c =='u'){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
