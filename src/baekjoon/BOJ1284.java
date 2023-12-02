package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1284 {
    public static void main(String[] args) throws IOException {
        //백준 1284 집 주소
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("0")){
                break;
            }

            //여백
            int len = s.length()+1;
            int sum =0;
            for (int i = 0; i <s.length() ; i++) {
                char target = s.charAt(i);
                if(target == '1'){
                    sum+=2;
                }else if(target == '0'){
                    sum+=4;
                }else{
                    sum+=3;
                }
            }
            sb.append(sum+len).append("\n");
        }
        System.out.println(sb);
    }
}
