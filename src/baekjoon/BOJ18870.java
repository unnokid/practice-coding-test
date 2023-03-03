package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BOJ18870 {

    public static void main(String[] args) throws IOException {
        //백준 18870 좌표 압축

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] target = new int[N];
        Map<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
            target[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(target);
        int count =0;
        for (int i = 0; i <target.length ; i++) {
            if(!map.containsKey(target[i])){
                map.put(target[i],count);
                count++;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}
