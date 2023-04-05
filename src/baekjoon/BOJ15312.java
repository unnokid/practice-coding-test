package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ15312 {
    public static void main(String[] args) throws IOException {
        //백준 15312 이름 궁합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        int[] count = new int[]{3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        Integer[] arr = new Integer[A.length()*2];

        for (int i = 0; i < A.length(); i++) {
            char f = A.charAt(i);
            char b = B.charAt(i);

            arr[i*2] = count[f-65];
            arr[i*2+1] = count[b-65];
        }

        List<Integer> list = Arrays.asList(arr);

        while(list.size()>2){
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i <list.size()-1 ; i++) {
                temp.add((list.get(i) + list.get(i + 1)) % 10);
            }
            list =temp;
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
    }
}
