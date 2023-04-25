package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1735 {
    public static void main(String[] args) throws IOException {
        //백준 1735 분수 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int x1 = Integer.parseInt(split[0]);
        int y1 = Integer.parseInt(split[1]);
        String[] s = br.readLine().split(" ");
        int x2 = Integer.parseInt(s[0]);
        int y2 = Integer.parseInt(s[1]);

        int resultX = (x1*y2)+(x2*y1);
        int resultY = y1*y2;

        int div = gcd(resultX,resultY);
        if(div != 1){
            resultX/=div;
            resultY/=div;
        }

        System.out.println(resultX+" "+resultY);
    }
    private static int gcd(int a, int b){
        if(a <b){
            int temp = a;
            a = b;
            b= temp;
        }

        while(b !=0){
            int r = a%b;
            a = b;
            b= r;
        }
        return a;
    }
}
