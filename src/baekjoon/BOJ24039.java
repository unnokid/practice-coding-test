package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ24039 {

    public static void main(String[] args) throws IOException {
        //백준 24039 2021은 무엇이 특별할까?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int len = 10000;
        boolean[] prime = new boolean[len+1];
        prime[0] = prime[1] = true;

        for (int i = 2; i*i <=len ; i++) {
            if(!prime[i]){
                for (int j = i*i; j <=len ; j+=i) {
                    prime[j] = true;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <prime.length ; i++) {
            if(!prime[i]){
                list.add(i);
            }
        }

        for (int i = 0; i <list.size() ; i++) {
            int target = list.get(i)*list.get(i+1);
            if(target > N){
                System.out.println(target);
                return;
            }
        }
    }
}
