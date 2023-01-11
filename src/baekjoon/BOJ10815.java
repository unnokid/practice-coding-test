package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10815 {

    public static void main(String[] args) throws IOException {
        //백준 10815 숫자 카드

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] map = new int[N];
        for (int i = 0; i < N ; i++) {
            map[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(map);
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(temp[i]);
            if(check(map,target)){
                sb.append(1+ " ");
            }else{
                sb.append(0+ " ");
            }
        }
        System.out.println(sb);
    }
    private static boolean check(int[] map, int target){
        int left =0;
        int right = map.length-1;

        while(left <= right){
            int idx = (left+right)/2;
            int mid = map[idx];

            if(target < mid){
                right = idx-1;
            }else if(target > mid){
                left = idx+1;
            }else{
                return true;
            }
        }

        return false;
    }
}
