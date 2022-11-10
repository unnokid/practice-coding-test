package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {

  public static void main(String[] args) throws IOException {
    //백준 9012 괄호

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      Stack<Character> stack = new Stack<>();

      String ps = br.readLine();

      for (int j = 0; j <ps.length() ; j++) {
        char ch = ps.charAt(j);

        if(ch == '('){
          stack.push(ch);
        }else{
          //닫는 경우
          if(stack.isEmpty()){
            //근데 비어있음
            stack.push(ch);
            break;
          }else{
            stack.pop();
          }
        }
      }

      if(stack.isEmpty()){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
