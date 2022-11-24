package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ2108 {

    public static void main(String[] args) throws IOException {
        //백준 2108 통계학

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] list = new int[N];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average =0 ;

        int[] plus = new int[4002];
        int[] minus = new int[4001];

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
            average+=list[i];
            min = Math.min(min, list[i]);
            max = Math.max(max, list[i]);

            if(list[i] <0){
                minus[Math.abs(list[i])]++;
            }else{
                plus[list[i]]++;
            }
        }
        Arrays.sort(list);

        int mode =0; //최빈값 대상
        int result = 0;
        for (int i = 0; i <plus.length ; i++) {
            mode = Math.max(plus[i],mode);
        }
        for (int i = 0; i <minus.length ; i++) {
            mode = Math.max(minus[i],mode);
        }

        List<Integer> temp = new ArrayList<>();

        for(int i : list) {
            if(i<0) {
                if(minus[Math.abs(i)] == mode && !(temp.contains(i))) {
                    temp.add(i);
                }
            }
            else {
                if(plus[i] == mode && !(temp.contains(i))) {
                    temp.add(i);
                }
            }
        }

        // 2개 이상이면 2번째로 작은 것 출력
        if(temp.size()>=2) {
            result = temp.get(1);
        }
        else {
            result = temp.get(0);
        }


        System.out.println((int)Math.round((double)average/N));
        System.out.println(list[N/2]);
        System.out.println(result);
        System.out.println(Math.abs(max-min));
    }
}
