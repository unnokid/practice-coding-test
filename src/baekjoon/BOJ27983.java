package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27983 {
    public static void main(String[] args) throws IOException {
        //백준 27983 리본(Eazy)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] idx = new int[N];
        int[] len = new int[N];
        boolean pass = false;
        StringBuilder sb = new StringBuilder();
        String[] idxList = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            idx[i] = Integer.parseInt(idxList[i]);
        }
        String[] lenList = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            len[i] = Integer.parseInt(lenList[i]);
        }
        String[] color = br.readLine().split(" ");

        for (int i = 0; i < N - 1; i++) {
            if (pass) {
                break;
            }
            for (int j = i + 1; j < N; j++) {
                if (!color[i].equals(color[j]) && Math.abs(idx[i] - idx[j]) <= len[i] + len[j]) {
                    pass = true;
                    sb.append("YES").append("\n");
                    sb.append((i + 1)).append(" ").append((j + 1));
                    break;
                }
            }
        }
        if (!pass) {
            sb.append("NO");
        }
        System.out.println(sb);


    }
}
