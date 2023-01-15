package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3711 {
    public static void main(String[] args) throws IOException {
        //백준 3711 학번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
            int k = 1;
            int[] dupChk = new int[1000000];
            while (true) {
                boolean chk = true;
                for (int i = 0; i < n; i++) {
                    int cur = arr[i]%k;
                    if (dupChk[cur] == k) {
                        chk = false;
                        break;
                    }
                    dupChk[cur] = k;
                }
                if (chk) {
                    sb.append(k).append('\n');
                    break;
                }
                k++;
            }
        }
        System.out.print(sb);
    }
}
