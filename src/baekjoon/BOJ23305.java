package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23305 {

    public static void main(String[] args) throws IOException {
        //백준 23305 수강변경

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        String[] want = br.readLine().split(" ");

        int[] school = new int[1000001];
        int count =0;
        for (int i = 0; i <s.length ; i++) {
            school[Integer.parseInt(s[i])]++;
        }

        for (int i = 0; i <want.length ; i++) {
            if(school[Integer.parseInt(want[i])] >0){
                school[Integer.parseInt(want[i])]--;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
