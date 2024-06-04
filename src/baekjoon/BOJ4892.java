package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4892 {
    public static void main(String[] args) throws IOException {
        //백준 4892 숫자 맞추기 게임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N ==0){
                break;
            }
            num++;
            sb.append(num).append(". ");



            boolean odd = true;
            int n1 = N*3;
            int n2;
            int n3;
            int n4;
            if(n1 %2 ==0){
                //짝수
                sb.append("even ");
                odd = false;
                n2 = n1/2;
            }else{
                sb.append("odd ");
                odd = true;
                n2 = (n1+1)/2;
            }

            n3 = 3*n2;
            n4 = n3/9;

            sb.append(n4).append("\n");
        }
        System.out.println(sb);

    }
}
