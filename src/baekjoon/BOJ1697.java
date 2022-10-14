package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1697 {
  static int[] visit = new int[100001];
  public static void main(String[] args) throws IOException {
    //백준 1697 숨바꼭질
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");

    //1초뒤에 X+1 or X-1 또는 순간이동 2*X 이동
    //동생 자리로 가는데 최소 시간

    int start = Integer.parseInt(split[0]);
    int end = Integer.parseInt(split[1]);

    if(start == end){
      System.out.println(0);
    }else{
      bfs(start,end);
    }
    System.out.println(Arrays.toString(visit));
  }
  static void bfs(int start, int end){
    Queue<Integer> q = new LinkedList<>();
    q.add(start);
    visit[start] = 1;

    while(!q.isEmpty()){
      int temp = q.poll();

      for (int i = 0; i < 3; i++) {
        int next;

        if(i ==0){
          next =temp +1;
        }else if(i == 1){
          next = temp -1;
        }else{
          next = temp*2;
        }

        if(next == end){
          System.out.println(visit[temp]);
          return;
        }

        if(next>=0 && next<visit.length && visit[next] ==0){
          q.add(next);
          visit[next] = visit[temp]+1;
        }
      }
    }
  }
}
