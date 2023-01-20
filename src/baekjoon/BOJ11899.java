package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ11899 {

    public static void main(String[] args) throws IOException {
        //백준 11899 괄호 끼워넣기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();

        Stack<Character> stack = new Stack<>();
        //괄호 문제는 보통 스택으로 판별

        for (int i = 0; i <s.length() ; i++) {
            char target = s.charAt(i);

            if(target =='('){
                stack.push(target);
            }else{
                if(stack.size()>0 && stack.peek() =='('){
                    stack.pop();
                }else{
                    stack.push(target);
                }
            }
        }
        System.out.println(stack.size());

    }
}
