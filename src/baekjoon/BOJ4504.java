package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4504 {
    public static void main(String[] args) throws IOException {
        //백준 4504 배수 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(true){
            int target = Integer.parseInt(br.readLine());

            if(target == 0){
                break;
            }

            sb.append(target);
            sb.append(target%N ==0 ? " is a multiple of " : " is NOT a multiple of ");
            sb.append(N).append(".\n");
        }
        System.out.println(sb);
    }
}
