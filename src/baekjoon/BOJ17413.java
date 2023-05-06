package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17413 {
    public static void main(String[] args) throws IOException {
        //백준 17413 단어 뒤집기2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();

        StringBuilder result = new StringBuilder();

        boolean pass = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char target = s.charAt(i);
            if(target == '<'){
                result.append(sb.reverse());
                pass =true;
                sb = new StringBuilder();
                sb.append(s.charAt(i));
            }else if(target =='>'){
                result.append(sb.append(target));
                pass =false;
                sb = new StringBuilder();
            }else if(target == ' '){
                if(pass){
                    // < 사이
                    sb.append(target);
                }else{
                    result.append(sb.reverse()).append(target);
                    sb = new StringBuilder();
                }
            }else{
                sb.append(target);
            }
        }

        if(!pass){
            result.append(sb.reverse());
        }
        System.out.println(result);
    }
}
