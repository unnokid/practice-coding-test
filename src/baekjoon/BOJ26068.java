package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ26068 {
    public static void main(String[] args) throws IOException {
        //백준 26068 치킨댄스를 추는 곰곰이를 본 임스2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count =0;
        for (int i = 0; i <N ; i++) {
            String[] split = br.readLine().split("-");
            int target = Integer.parseInt(split[1]);
            if(target <=90){
                count++;
            }
        }
        System.out.println(count);
    }
}
