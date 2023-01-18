package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ10816 {

    public static void main(String[] args) throws IOException {
        //백준 10816 숫자 카드2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] getCards = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            map.put(Integer.valueOf(getCards[i]),map.getOrDefault(Integer.valueOf(getCards[i]),0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        String[] target = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            if(map.containsKey(Integer.valueOf(target[i]))){
                int temp = map.get(Integer.valueOf(target[i]));
                sb.append(temp).append(" ");
            }else{
                sb.append("0").append(" ");
            }
        }

        System.out.println(sb);
    }

}
