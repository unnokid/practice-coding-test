package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1244 {
    public static void main(String[] args) throws IOException {
        //백준 1244 스위치 켜고 끄기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];
        String[] s = br.readLine().split(" ");
        for (int i = 1; i <=N ; i++) {
            arr[i] = Integer.parseInt(s[i-1]);
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] s1 = br.readLine().split(" ");
            int gender = Integer.parseInt(s1[0]);
            int num = Integer.parseInt(s1[1]);

            if(gender == 1){
                man(num,arr);
            }else{
                women(num,arr);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=N ; i++) {
            sb.append(arr[i]).append(" ");
            if(i%20 ==0){
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
    static void man(int num, int[] arr){
        int idx = num;

        while(idx < arr.length){
            if(arr[idx] ==0){
                arr[idx] =1;
            }else{
                arr[idx] = 0;
            }
            idx+=num;
        }
    }
    static void women(int num, int[] arr){
        //현재 위치 변경
        if(arr[num] ==0){
            arr[num] = 1;
        }else{
            arr[num] =0;
        }

        int count = 1;
        while((num - count) >0 && (num+count) < arr.length){
            if(arr[num + count] == arr[num - count]){
                //둘이 동일할 경우
                if(arr[num+count] ==0){
                    arr[num+count] = 1;
                    arr[num-count] = 1;
                }else {
                    arr[num+count] = 0;
                    arr[num-count] = 0;
                }
                count++;
            }else{
                break;
            }
        }
    }
}
