package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {

  public static void main(String[] args) throws IOException {
    //백준 10773 제로

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    int total =0;
    for (int i = 0; i < N; i++) {
      int target = Integer.parseInt(br.readLine());

      if(target == 0){
        stack.pop();
      }else{
        stack.push(target);
      }
    }

    while(!stack.isEmpty()){
      total+= stack.pop();
    }
    System.out.println(total);
  }
}
