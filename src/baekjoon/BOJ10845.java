package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ10845 {

  public static void main(String[] args) throws IOException {
    //백준 10845 큐

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Queue<Integer> q = new LinkedList<>();
    int target = 0;
    for (int i = 0; i < N; i++) {
      String[] s = br.readLine().split(" ");

      if(s.length ==2){
        target = Integer.parseInt(s[1]);
      }
      if(s[0].equals("push")) {
        q.add(target);
      }else if(s[0].equals("front")){
        System.out.println(q.isEmpty()?-1:q.peek());
      }else if(s[0].equals("back")) {
        System.out.println(q.isEmpty()?-1:target);
      }else if(s[0].equals("size")) {
        System.out.println(q.size());
      }else if(s[0].equals("pop")) {
        System.out.println(q.isEmpty()?-1:q.poll());
      }else if(s[0].equals("empty")) {
        System.out.println(q.isEmpty()?1:0);
      }


    }
  }
}
