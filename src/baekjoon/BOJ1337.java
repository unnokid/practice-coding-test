package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ1337 {

    public static void main(String[] args) throws IOException {
        //백준 1337 올바른 배열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <N ; i++) {
            int target = Integer.parseInt(br.readLine());
            list.add(target);
        }
        Collections.sort(list);
        int max =0;
        int count =0;
        int limit = N<5 ? 1:N;

        for (int i = 0; i <limit ; i++) {
            int num = list.get(i)+4;
            for (int j = 0; j <N-i ; j++) {
                int temp = list.get(i+j);
                if(num >= temp){
                    count++;
                }else{
                    break;
                }
            }

            max = Math.max(max,count);
            count =0;
        }

        System.out.println(5-max);



    }
}
