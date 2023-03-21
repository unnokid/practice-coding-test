package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1138 {

    public static void main(String[] args) throws IOException {
        //백준 1138 한 줄로 서기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
    
        //배열은 자기 자신보다 오른쪽으로 큰사람들을 카운트함
        //큰 순서대로 자신의 자리에 list 형식으로 넣음
        int[] arr = new int[N+1];
        
        String[] s = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(s[i-1]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = N; i >0 ; i--) {
            list.add(arr[i],i);
        }

        StringBuilder sb = new StringBuilder();
        for(int t: list){
            sb.append(t).append(" ");
        }
        System.out.println(sb);
    }
}
