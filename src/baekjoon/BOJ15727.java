package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15727 {
    public static void main(String[] args) throws IOException {
        //백준 15727 조별과제를 하려는데 조장이 사라졌다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        if(A%5 ==0){
            System.out.println(A/5);
        }else{
            System.out.println(A/5 +1);
        }
    }
}
