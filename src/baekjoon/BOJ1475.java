package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1475 {

    public static void main(String[] args) throws IOException {
        //백준 1475 방 번호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] list = new int[10];
        int total =0 ;
        while(num >0){
            int target = num%10;
            list[target]++;
            num/=10;
        }

        for (int i = 0; i <list.length ; i++) {
            if(i == 6 || i == 9){
                continue;
            }
            total = Math.max(total,list[i]);
        }

        if(list[6] + list[9] %2 ==0){
            total = Math.max(total, (list[6]+list[9])/2);
        }else{
            total = Math.max(total, (list[6]+list[9]+1)/2);
        }

        System.out.println(total);
    }
}
