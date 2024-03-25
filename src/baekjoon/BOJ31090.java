package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31090 {
    public static void main(String[] args) throws IOException {
        //백준 31090 2023은 무엇이 특별할까?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<N;i++){
            int target = Integer.parseInt(br.readLine());
            int next = target+1;
            
            if(next%(target%100) == 0){
                sb.append("Good").append("\n");
            }else{
                sb.append("Bye").append("\n");
            }
        }
        System.out.println(sb);
    }
}
