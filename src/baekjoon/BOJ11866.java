package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BOJ11866 {

    public static void main(String[] args) throws IOException {
        //백준 11866 요세푸스 문제0

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        StringBuilder sb= new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <=N ; i++) {
            q.add(i);
        }

        sb.append("<");

        while(q.size()>1){
            for (int i = 0; i <K-1 ; i++) {
                int val = q.poll();
                q.offer(val);
            }

            sb.append(q.poll()).append(",");
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
