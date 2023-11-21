package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ2535 {
    public static void main(String[] args) throws IOException {
        //백준 2535 아시아 정보올림피아드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        PriorityQueue<player> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++) {
            String[] s = br.readLine().split(" ");
            int country = Integer.parseInt(s[0]);
            int num = Integer.parseInt(s[1]);
            int score = Integer.parseInt(s[2]);
            pq.add(new player(country, num, score));
        }
        int count = 0;
        while(!pq.isEmpty()) {
            if(arr[pq.peek().country]!=2) {
                arr[pq.peek().country]++;
                sb.append(pq.peek().country).append(" ").append(pq.peek().num).append("\n");
                count++;
            }
            pq.poll();
            if(count==3) break;
        }
        System.out.println(sb);
    }
    public static class player implements Comparable<player> {
        int country;
        int num;
        int score;

        public player(int country, int num, int score) {
            this.country = country;
            this.num = num;
            this.score = score;
        }

        @Override
        public int compareTo(player o) {
            return  o.score - this.score;
        }
    }
}
