package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        //백준 2501 약수구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int count =0;
        int target =0;
        for (int i = 1; i <=N ; i++) {
            if(N%i ==0){
                count++;

            }
            if(count == k){
                target = i;
                break;
            }
        }
        System.out.println(target);


    }
}
