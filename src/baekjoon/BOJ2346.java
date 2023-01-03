package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2346 {

    public static void main(String[] args) throws IOException {
        //백준 2346 풍선 터뜨리기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        String[] s = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            list.add(new int[]{i+1, Integer.parseInt(s[i])});
        }

        int idx =0;
        while(list.size() !=1){
            int move = list.get(idx)[1];
            int size =list.size()-1;

            sb.append(list.get(idx)[0]).append(" ");
            list.remove(idx);

            if(move >0){
                move--;
            }
            idx = (idx+move )%size;

            if(idx <0){
                idx+=size;
            }

        }

        sb.append(list.get(0)[0]);
        System.out.println(sb);
    }
}
