package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1107 {
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        //백준 1107 리모컨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        check = new boolean[10];
        String[] s = new String[0];
        if(M !=0){
            s = br.readLine().split(" ");    
        }
        
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(s[i]);
            check[target] = true;
        }

        //첫 기준은 그냥 + -로 이동한 거리
        //N이 너무 작으면 안됨
        int count =  Math.abs(N-100);

        //새로 번호를 누를지 or 아니면 + -로 이동할지
        //망가진 숫자가 있다면 그냥 + - 로 이동
        //완성된 숫자가 가능하다면 채널 번호 길이 만큼 이동

        for (int i = 0; i <1000000 ; i++) {
            int target = checking(i);
            if(target >0){
                //만약 도달하지 못했다면 그 차이만큼 더해서 계산 해야함
                count = Math.min(count, target+ Math.abs(N-i));
            }
        }

        System.out.println(count);
    }
    private static int checking(int target){

        if(target ==0){
            //while 문으로 넘어가지 못하는 예외 처리
            if(check[0]){
                return 0;
            }else{
                //press =1;
                return 1;
            }
        }

        int press =0;
        while(target>0){
            //넘어온 숫자중 고장난 숫자가 있는가?
            if(check[target%10]){
                return 0;
            }
            target/=10;
            press++;
        }
        return press;
    }
}
