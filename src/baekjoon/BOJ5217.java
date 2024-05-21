package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ5217 {
    public static void main(String[] args) throws IOException {
        //백준 5217 쌍의 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            List<String> list = new ArrayList<>();
            int target = Integer.parseInt(br.readLine());
            int len = target%2 ==0 ? target/2: target/2 +1;
            for (int j = 1; j < len; j++) {
                if(j == target -j){
                    break;
                }
                list.add(j+" "+(target-j));
            }
            sb.append("Pairs for ").append(target).append(": ");
            for (int j = 0; j <list.size() ; j++) {
                if(j !=0){
                    sb.append(", ");
                }
                sb.append(list.get(j));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
