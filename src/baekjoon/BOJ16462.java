package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16462 {
    public static void main(String[] args) throws IOException {
        //백준 16462 '나교수' 교수님의 악필
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double avg = 0;
        for(int i = 0; i < N; i++){
            String target = br.readLine();
            if(Integer.parseInt(target) == 100){
                avg += 100;
            } else{
                target = target.replace("0", "9");
                target = target.replace("6", "9");
                avg += Integer.parseInt(target);
            }
        }
        avg = avg / (double) N;
        System.out.println((int) Math.round(avg));
    }
}
