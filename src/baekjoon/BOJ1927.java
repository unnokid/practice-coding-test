package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ1927 {

  public static void main(String[] args) throws IOException {
    //백준 1927 최소 힙

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i <N ; i++) {
      int target = Integer.parseInt(br.readLine());
      if(target == 0){
          if(pq.isEmpty()){
            System.out.println(0);
          }else{
            System.out.println(pq.poll());
          }
      }else{
        pq.add(target);
      }

    }

  }
}
