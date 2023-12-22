package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ22935 {
    public static void main(String[] args) throws IOException {
        //백준 22935 이진 딸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strawberry = new String[16];

        for (int i = 1; i <=15 ; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 3; j >=0 ; j--) {
                temp.append( (i&1<<j) !=0 ? "딸기" : "V" );
            }
            strawberry[i] = temp.toString();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int count = Integer.parseInt(br.readLine())-1;
            count %=28;
            count++;
            if(count<=15){
                sb.append(strawberry[count]).append("\n");
            }else{
                sb.append(strawberry[30-count]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
