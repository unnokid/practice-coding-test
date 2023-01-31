package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BOJ1874 {

    public static void main(String[] args) throws IOException {
        //백준 1874 스택 수열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean pass = false;
        int target =1 ;
        for (int i = 0; i < N; i++) {
            int next = Integer.parseInt(br.readLine());

            while(target <= next){
                stack.push(target);
                sb.append("+").append("\n");
                target++;
            }

            if(stack.peek() == next){
                stack.pop();
                sb.append("-").append("\n");
            }else{
                pass =true;
            }
        }
        if(pass){
            System.out.println("NO");
        }else{
            System.out.println(sb);
        }


    }
}
