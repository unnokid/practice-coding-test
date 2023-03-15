package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1453 {

    public static void main(String[] args) throws IOException {
        //백준 1453 피시방 알바

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        boolean[] pc = new boolean[101];

        String[] s = br.readLine().split(" ");
        int count =0;
        for (int i = 0; i < s.length; i++) {
            int target = Integer.parseInt(s[i]);
            if (!pc[target]){
                pc[target] = true;
            }else{
                count++;
            }
        }

        System.out.println(count);
    }
}
