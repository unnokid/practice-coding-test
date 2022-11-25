package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1940 {

    public static void main(String[] args) throws IOException {
        //백준 1940 주몽

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] map = new int[T];
        int result = 0;
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < T; i++) {
            map[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(map);

        int left = 0;
        int right = map.length-1;

        while(left < right){
            if(map[left]+map[right] == M){
                result++;
                left++;
                right--;
            }else if(map[left]+map[right] < M){
                left++;
            }else{
                right--;
            }
        }

        System.out.println(result);

    }
}
