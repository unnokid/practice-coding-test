package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2161 {

    public static void main(String[] args) throws IOException {
        //백준 2161 카드1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        //순서대로 카드 놓기
        for (int i = 1; i <= N ; i++) {
            list.add(i);
        }

        boolean pass = true;

        while(list.size()>1){
            if(pass){
                result.add(list.remove(0));
                pass= false;
            }else{
                list.add(list.remove(0));
                pass =true;
            }
        }

        StringBuilder sb = new StringBuilder();
        // 출력
        for (int next : result) {
            sb.append(next).append(" ");
        }
        sb.append(list.get(0));

        System.out.println(sb);
    }
}
