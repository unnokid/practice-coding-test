package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1350 {
    public static void main(String[] args) throws IOException {
        //백준 1350 진짜 공간
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        long size = Long.parseLong(br.readLine());
        long count =0;
        for (int i = 0; i <s.length ; i++) {
            long target = Long.parseLong(s[i]);
            if(target ==0){
                continue;
            }
            if(target%size ==0){
                count+=target/size;
            }else{
                count+=target/size;
                count++;
            }
        }
        System.out.println(size*count);
    }
}
