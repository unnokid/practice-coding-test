package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2999 {
    public static void main(String[] args) throws IOException {
        //백준 2999 비밀 이메일
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int n =s.length();

        int len= 0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                len = Math.max(len, i);
            }
        }
        int c = n/len;

        char[][] arr = new char[len][c];
        int idx = 0;
        for(int j=0;j<c;j++) {
            for(int i=0;i<len;i++) {
                arr[i][j]=s.charAt(idx++);
            }
        }
        for(int i=0;i<len;i++) {
            for(int j=0;j<c;j++) {
                sb.append(arr[i][j]);
            }
        }
        System.out.println(sb);
    }
}
