package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ21756 {
    public static void main(String[] args) throws IOException {
        //백준 21756 지우개

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int idx =0;
        while(list.size() > 1){
            list.remove(idx);
            idx+=1;
            if(idx >= list.size()){
                idx =0;
            }
        }
        System.out.println(list.get(0));
    }

}
