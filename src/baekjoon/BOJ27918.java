package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27918 {
    public static void main(String[] args) throws IOException {
        //백준 27918 탁구 경기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int A = 0;
        int B = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.equals("D")){
                A++;
            }else{
                B++;
            }

            if(Math.abs(A-B) == 2){
                break;
            }
        }
        System.out.println(A+":"+B);
    }
}
