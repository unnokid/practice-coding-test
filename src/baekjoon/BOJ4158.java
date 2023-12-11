package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ4158 {
    public static void main(String[] args) throws IOException {
        //백준 4158 CD
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            if(A ==0 && B ==0){
                break;
            }
            Set<Integer> set = new HashSet<>();
            int count =0;
            for (int i = 0; i < A; i++) {
                int N = Integer.parseInt(br.readLine());
                set.add(N);
            }
            for (int i = 0; i < B; i++) {
                int target = Integer.parseInt(br.readLine());
                if(set.contains(target)){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
