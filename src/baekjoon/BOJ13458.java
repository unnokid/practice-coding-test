package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13458 {

    public static void main(String[] args) throws IOException {
        //백준 13458 시험 감독

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int[] map = new int[N];
        long total = 0;
        for (int i = 0; i <N ; i++) {
            map[i] = Integer.parseInt(s[i]);
        }
        String[] temp = br.readLine().split(" ");
        int B = Integer.parseInt(temp[0]);
        int C = Integer.parseInt(temp[1]);

        for (int i = 0; i <N ; i++) {
            if(map[i] > B){
                total++;
                map[i] -= B;

                if(map[i]%C ==0){
                    total += map[i]/C;
                }else{
                    total+= (map[i]/C)+1;
                }
            }else{
                total++;
            }
        }

        System.out.println(total);
    }
}
