package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31831 {
    public static void main(String[] args) throws IOException {
        //백준 31831 과민성 대장 증후군
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int stress = 0;
        int count =0;
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int next  = Integer.parseInt(s1[i]);
            stress = Math.max(0,stress+next);
            if(stress >= M){
                count++;
            }
        }
        System.out.println(count);
    }
}
