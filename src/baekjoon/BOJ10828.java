package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        //백준 10828 스택
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            String target = s[0];
            int num =0;
            if(s.length >1){
                num = Integer.parseInt(s[1]);
            }

            switch (target) {
                case "push":
                    stack.push(num);
                    break;
                case "pop":
                    System.out.println(stack.empty() ? -1 : stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(stack.empty() ? -1 : stack.peek());
                    break;
            }
        }
    }
}
