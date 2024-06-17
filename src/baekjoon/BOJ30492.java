package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ30492 {
    public static void main(String[] args) throws IOException {
        //백준 30492 Democratic Naming
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            int[] arr = new int[26];
            for (int j = 0; j < N; j++) {
                char c = words[j].charAt(i) ;
                //System.out.println("현재 타겟: "+c);
                int idx = c -'0'-49;
                arr[idx]++;

            }
            char result = 'a';
            int limit =-1;
            int idx =0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j] > limit){
                    limit = arr[j];
                    idx =j;
                }
            }
            result = (char) (idx+97);
            sb.append(result);
        }
        System.out.println(sb);
    }
}
