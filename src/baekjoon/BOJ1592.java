package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1592 {
    public static void main(String[] args) throws IOException {
        //백준 1592 영식이와 친구들
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int L = Integer.parseInt(s[2]);

        int[] arr = new int[N];
        int idx =0;
        int count =0;
        while(true){
            arr[idx]++;
            if(arr[idx] >= M){
                break;
            }
            count++;

            if(arr[idx]%2==0){
                //짝수 반시계방향
                idx = (idx-L+arr.length)%arr.length;
            }else{
                //홀수 시계방향
                idx = (idx+L) %arr.length;
            }
        }
        System.out.println(count);
    }
}
