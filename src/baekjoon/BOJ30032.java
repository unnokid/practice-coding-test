package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30032 {
    public static void main(String[] args) throws IOException {
        //백준 30032 알파벳 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int D = Integer.parseInt(s[1]);

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <N ; i++) {
            String[] s1 = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                String next = s1[j];
                if(D == 1){
                    //상하 뒤집기
                    if(next.equals("b")){
                        sb.append("p");
                    }else if(next.equals("d")){
                        sb.append("q");
                    }else if(next.equals("p")){
                        sb.append("b");
                    }else{
                        sb.append("d");
                    }
                }else{
                    //상하 뒤집기
                    if(next.equals("b")){
                        sb.append("d");
                    }else if(next.equals("d")){
                        sb.append("b");
                    }else if(next.equals("p")){
                        sb.append("q");
                    }else{
                        sb.append("p");
                    }
                }

            }
            sb.append("\n");
        }
        System.out.println(sb);



    }
}
