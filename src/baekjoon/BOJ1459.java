package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1459 {

    public static void main(String[] args) throws IOException {
        //백준 1459 걷기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long x = Long.parseLong(s[0]);
        long y = Long.parseLong(s[1]);
        long way = Long.parseLong(s[2]);
        long diagonal = Long.parseLong(s[3]);

        long result = 0;
        if(2*way < diagonal) {
            //그냥 이동
            result = (x+y)*way;
        }
        else if(2*way > 2*diagonal) {
            if((x+y)%2==0) {
                result = Math.max(x, y)*diagonal;
            }
            else {
                result = (Math.max(x, y)-1)*diagonal;
                result+=way;

            }
        }
        else {
            if(x==y) {
                result = diagonal*x;
            }
            else {
                result = Math.min(x*diagonal, y*diagonal);
                result+=Math.abs(x-y)*way;
            }
        }
        System.out.println(result);
    }
}
