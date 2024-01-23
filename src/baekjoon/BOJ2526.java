package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2526 {
    public static void main(String[] args) throws IOException {
        //백준 2526 싸이클
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int P = Integer.parseInt(s[1]);

        int len =0;
        int next =N;
        int[] arr = new int[P+1];
        boolean pass = true;

        while(pass){
            next = (N*next) %P;

            for (int i = 0; i < len; i++) {
                if(arr[i] == next){
                    pass = false;
                    System.out.println(len - i);
                    break;
                }
            }
            arr[len] = next;
            len++;
        }

    }
}
