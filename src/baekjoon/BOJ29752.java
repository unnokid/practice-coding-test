package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ29752 {
    public static void main(String[] args) throws IOException {
        //백준 29752 최장 스트릭
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int len =0;
        int result = -1;
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int next = Integer.parseInt(s[i]);
            if(next >0){
                len++;
            }else{
                result = Math.max(result,len);
                len =0;
            }
        }
        result = Math.max(result,len);
        System.out.println(result);
    }
}
