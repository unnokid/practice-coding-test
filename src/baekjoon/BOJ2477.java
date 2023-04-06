package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2477 {
    public static void main(String[] args) throws IOException {
        //백준 2477 참외밭

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int result =0;



        for (int i = 0; i < 6; i++) {
            String[] s = br.readLine().split(" ");
            int len = Integer.parseInt(s[1]);
            list.add(len);
        }

        int total =0;
        for (int i = 0; i < 5; i++) {
            int sum = list.get(i) * list.get(i+1);
            if(sum > result){
                result = sum;
            }
            total+=sum;
        }

        total+= list.get(0)*list.get(5);

        if(list.get(0)* list.get(5) > result){
            result = list.get(0)* list.get(5);
        }

        System.out.println((total - 2* result)* K);
    }
}
