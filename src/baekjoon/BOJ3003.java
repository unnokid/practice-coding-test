package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3003 {
    public static void main(String[] args) throws IOException {
        //백준 3003 킹,퀸,룩,비숍,나이트,폰
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[]{1,1,2,2,2,8};
        String[] s = br.readLine().split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <s.length ; i++) {
            int target = Integer.parseInt(s[i]);
            sb.append(arr[i]-target).append(" ");
        }
        System.out.println(sb);
    }
}
