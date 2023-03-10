package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1205 {

    public static void main(String[] args) throws IOException {
        //백준 1205 등수 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int score = Integer.parseInt(s[1]);
        int P = Integer.parseInt(s[2]);

        int[] rank = new int[N];


        if(N ==0){
            System.out.println(1);
            return;
        }

        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < rank.length; i++) {
            rank[i] = Integer.parseInt(s1[i]);
        }

        //N개의 등수표, P개 만큼 등록가능
        if(N == P && score <= rank[rank.length-1])
            System.out.print(-1);
        else{
            int idx = 1;
            for(int i=0; i<rank.length; i++){
                if(score < rank[i])
                    idx++;
                else
                    break;
            }
            System.out.print(idx);
        }

    }
}
