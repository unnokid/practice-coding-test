package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5597 {
    public static void main(String[] args) throws IOException {
        //백준 5597 과제 안 내신 분..?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] checked = new boolean[31];
        for (int i = 0; i <28 ; i++) {
            int T = Integer.parseInt(br.readLine());
            checked[T] = true;
        }

        for (int i = 1; i <checked.length; i++) {
            if(!checked[i]){
                System.out.println(i);
            }
        }

    }
}
