package baekjoon;

import java.io.*;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        //백준 15552 빠른 A+B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T= Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] split = br.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            bw.write(A+B+"\n");
        }

        bw.close();


    }
}
