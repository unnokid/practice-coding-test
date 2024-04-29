package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30821 {
    public static void main(String[] args) throws IOException {
        //백준 30821 별자리가 될 수 있다면
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int target = Math.min(N - 5, 5);;

        long result = factorial(N, target) / factorial(target, target);
        System.out.println(result);

    }
    static public long factorial(int start,int target){
        long sum =1;
        for (int i = start; i >start -target ; i--) {
            sum*=i;
        }
        return sum;
    }
}
