package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2845 {
    public static void main(String[] args) throws IOException {
        //백준 2845 파티가 끝나고 난 뒤

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int L = Integer.parseInt(s[0]);
        int P = Integer.parseInt(s[1]);

        StringBuilder sb = new StringBuilder();
        String[] peopleList = br.readLine().split(" ");
        int target = L*P;
        for (int i = 0; i < 5; i++) {
            int people = Integer.parseInt(peopleList[i]);
            sb.append(people-target).append(" ");
        }
        System.out.println(sb);


    }
}
