package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3034 {
    public static void main(String[] args) throws IOException {
        //백준 3034 앵그리 창영
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);
        int H = Integer.parseInt(s[2]);

        for (int i = 0; i <N ; i++) {
            int n = Integer.parseInt(br.readLine());

            //가로 세로보다 길거나 같으면 해결
            //대각선도 있음
            if(n <=W || n<=H){
                System.out.println("DA");
            }else if(n <= Math.sqrt(Math.pow(W,2) + Math.pow(H,2))){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
