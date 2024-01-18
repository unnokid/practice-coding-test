package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ21312 {
    public static void main(String[] args) throws IOException {
        //백준 21312 홀짝 칵테일
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int[] arr= new int[3];
        boolean pass= false;
        int one = 1;
        int two = 1;
        for (int i = 0; i <3 ; i++) {
            int target =Integer.parseInt(s[i]);
            if(target %2 ==1){
                one *= target;
                pass = true;
            }else{
                two*=target;
            }
        }
        System.out.println(pass? one:two);


    }
}
