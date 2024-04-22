package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17502 {
    public static void main(String[] args) throws IOException {
        //백준 17502 클레어와 팰린드롬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String target = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= target.length()/2-1; i++) {
            char first = target.charAt(i);
            char last = target.charAt(target.length()-1-i);
            if(first == last){
                if(first == '?'){
                    first = 'a';
                }
                sb.append(first);

            }else{
                if(first == '?'){
                    first = last;
                }
                sb.append(first);
            }
        }
        String temp = sb.toString();
        sb = sb.reverse();

        StringBuilder result = new StringBuilder();
        result.append(temp);
        if(N % 2== 1){
            char middle = target.charAt(N/2);
            if(middle == '?'){
                middle = 'a';
            }
            result.append(middle);
        }
        result.append(sb);
        System.out.println(result);
    }
}
