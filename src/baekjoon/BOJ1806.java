package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1806 {
    public static void main(String[] args) throws IOException {
        //백준 1806 부분합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int S = Integer.parseInt(s[1]);
        int result = Integer.MAX_VALUE;
        int[] arr = new int[N];
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        //a~b 까지 길이와 합을 고려해야함 point를 2개씩 움직이며 합을 고려해보자
        int start =0;
        int end =0;
        int sum =0;

        //배열 내부에서 start~end가 존재할 수 있을때 까지
        //끝까지 갔는데 더욱 숫자가 필요하다면 그순간 끝
        while(true){
            if(sum >=S){
                //길이 갱신
                result = Math.min(end-start, result);
                //혹시 조금 짧아져도 만족할지 줄이기
                sum-= arr[start];
                start++;
            }
            else if(N== end){
                //인덱스가 터져서 여기서 break;
                break;
            }
            else{
                //숫자가 아직 부족함
                sum+=arr[end];
                end++;
            }
        }

        if(result == Integer.MAX_VALUE){
            System.out.println("0");
        }else{
            System.out.println(result);
        }
    }
}
