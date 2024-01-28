package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ5648 {
    public static void main(String[] args) throws IOException {
        //백준 5648 역원소 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        long[] arr= new long[N];

        while (N > 0) {
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                StringBuilder temp = new StringBuilder();
                for (int i = str.length() - 1; i >= 0; i--) {
                    temp.append(str.charAt(i));
                }
                arr[--N] = Long.parseLong(temp.toString());
            }
            if(N>0)
                st = new StringTokenizer(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
