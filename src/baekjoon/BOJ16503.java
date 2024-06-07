package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16503 {
    public static void main(String[] args) throws IOException {
        //백준 16503 괄호없는 사칙연산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(s[0]);
        String b = s[1];
        int c = Integer.parseInt(s[2]);
        String d= s[3];
        int e = Integer.parseInt(s[4]);


        int result1 = calculate(calculate(a,b,c),d,e);
        int result2 = calculate(a,b,calculate(c,d,e));

        sb.append(Math.min(result1,result2)).append("\n");
        sb.append(Math.max(result1,result2)).append("\n");

        System.out.println(sb);

    }
    static public int calculate(int a, String b, int c){
        if(b.equals("+")){
            return a+c;
        }else if(b.equals("-")){
            return a-c;
        }else if(b.equals("*")){
            return a*c;
        }else{
            return a/c;
        }
    }
}
