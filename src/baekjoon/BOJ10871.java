package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10871 {
    public static void main(String[] args) throws IOException {
        //백준 10871 X보다 작은 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();

        String[] lists = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            int target = Integer.parseInt(lists[i]);

            if(target <X){
                sb.append(target).append(" ");
            }
        }
        System.out.println(sb);
    }
}
