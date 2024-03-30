package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30999 {
    public static void main(String[] args) throws IOException {
        //백준 30999 민주주의
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int total =0;
        
        for(int i=0;i<N;i++){
            char[] chars = br.readLine().toCharArray();
            int plus =0;
            int minus =0;
            for(int j=0;j<chars.length;j++){
                if(chars[j] == 'O'){
                    plus++;
                }else{
                    minus++;
                }
            }
            total+= plus > minus ? 1:0;
        }
        System.out.println(total);
    }
}
