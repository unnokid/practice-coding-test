package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ11068 {
    public static void main(String[] args) throws IOException {
        //백준 11068 회문인 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            boolean pass = false;
            for (int j = 2; j <=64 && !pass ; j++) {
                pass = checking(num,j);
            }
            if(pass){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }

        }
        System.out.println(sb);
    }
    private static boolean checking(int n, int d){
        List<Integer> list = new ArrayList<>();

        while(n!=0){
            list.add(n%d);
            n/=d;
        }

        for (int i = 0; i <list.size()/2 ; i++) {
            if(!list.get(i).equals(list.get(list.size() - 1 - i))){
                return false;
            }
        }
        return true;
    }
}
