package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25304 {
    public static void main(String[] args) throws IOException {
        //백준 25304 영수증

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int sum =0;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int price = Integer.parseInt(s[0]);
            int count = Integer.parseInt(s[1]);
            sum+= price*count;
        }

        if(total == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
