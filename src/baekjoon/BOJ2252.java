package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BOJ2252 {

  public static void main(String[] args) throws IOException {
    //백준 2252 줄 세우기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    int N = Integer.parseInt(s[0]);
    int M = Integer.parseInt(s[1]);

    List<Integer> result = new ArrayList<>();
    
    int[] student = new int[N+1];
    List<Integer>[] list = new List[N+1];
    
    for (int i = 1; i <= N ; i++) {
      //i 보다 작은 녀석들 넣는 리스트
      list[i] = new ArrayList<>();
    }

    for (int i = 0; i < M; i++) {
      String[] split = br.readLine().split(" ");
      //a가 앞에 서야함
      int a = Integer.parseInt(split[0]);
      int b = Integer.parseInt(split[1]);

      //b입장에선 자기보다 큰녀석의 연관관계 개수 추가
      student[b]+=1;
      //list[a]는 a보다 작은 b를 기록
      list[a].add(b);
    }


    Queue<Integer> q = new LinkedList<>();
    for (int i = 1; i <= N ; i++) {
      if(student[i] ==0){
        //연관관계없었던 놈 q에 추가
        q.add(i);
      }
    }


    while(!q.isEmpty()){
      int cur = q.poll();
      result.add(cur);
      for (int i = 0; i <list[cur].size() ; i++) {
        //cur보다 작았던 놈들 추적
        int next = list[cur].get(i);
        student[next] -= 1;
        if(student[next] ==0){
          //next보다 큰녀석이 이제 없으면 이친구도 큐에 추가
          q.add(next);
        }
      }
    }

    //결과 출력
    for (int i = 0; i <result.size() ; i++) {
      System.out.print(result.get(i)+" ");
    }
  }
}
