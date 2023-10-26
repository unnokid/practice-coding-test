package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1267 {
    public static void main(String[] args) throws IOException {
        //백준 1267 핸드폰 요금
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int Y = 0;
        int M =0;
        String[] s = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(s[i]);
            Y += (arr[i]/30)*10;
            M += (arr[i]/60)*15;
            Y += arr[i]%30 >=0 ? 10 :0;
            M += arr[i]%60 >=0 ? 15 :0;
        }



        if(Y == M){
            System.out.println("Y M "+Y);
        }else if(Y > M){
            System.out.println("M "+M);
        }else{
            System.out.println("Y "+Y);
        }
    }
}
