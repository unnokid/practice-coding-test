package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        //백준 10250 ACM 호텔
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int H = Integer.parseInt(s[0]);
            int W = Integer.parseInt(s[1]);
            int N = Integer.parseInt(s[2]);


            if(N%H ==0){
                System.out.println(H*100 + N/H);
            }else{
                System.out.println((N%H)*100  + (N/H)+1);
            }
        }

    }
}
