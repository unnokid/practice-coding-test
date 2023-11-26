package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1822 {
    public static void main(String[] args) throws IOException {
        //백준 1822 차집합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();
        TreeSet<Integer> set = new TreeSet<Integer>();
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");
        for (int i = 0; i <A ; i++) {
            set.add(Integer.valueOf(first[i]));
        }
        int count =0;
        for (int i = 0; i < B; i++) {
            int target = Integer.parseInt(second[i]);
            if(set.contains(target)){
                set.remove(target);
            }
        }
        System.out.println(set.size());
        for(int n: set){
            System.out.print(n+" ");
        }
    }
}
