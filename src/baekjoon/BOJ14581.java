package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14581 {
    public static void main(String[] args) throws IOException {
        //백준 14581 팬들에게 둘러싸인 홍준

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String fan = ":fan:";
        StringBuilder sb =new StringBuilder();
        for (int i = 1; i <= 9; i++) {

            if(i == 5){
                sb.append(":").append(s).append(":");
            }else if(i%3 ==0){
                sb.append(fan).append("\n");
            }else{
                sb.append(fan);
            }
        }
        System.out.println(sb);
    }
}
