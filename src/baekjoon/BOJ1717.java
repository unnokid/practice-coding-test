package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1717 {
  static int[] map;
  public static void main(String[] args) throws IOException {
    //백준 1717 집합의 표현
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] split = br.readLine().split(" ");
    int N = Integer.parseInt(split[0]);// 정점 개수
    int M = Integer.parseInt(split[1]);//간선 개수
    map = new int[N+1];
    for (int i = 0; i <= N ; i++) {
      map[i] = i;
    }

    for (int i = 0; i <M ; i++) {
      String[] temp = br.readLine().split(" ");
      int t = Integer.parseInt(temp[0]);
      int a = Integer.parseInt(temp[1]);
      int b = Integer.parseInt(temp[2]);

      if(t == 0){
        //집합 합치기
        union(a,b);
      }else if(t == 1){
        //두집합이 같은 집합인지 확인
        same(a,b);
      }
    }


  }
  static void union(int x , int y){
    //집합 합치기
    x = find(x);
    y = find(y);
    if(x != y){
      map[y] = x;
    }
  }

  static int find(int x){
    if(x == map[x]){
      //최상위 부모 상태
      return x;
    }else{
      return map[x] = find(map[x]);
    }
  }

  public static void same(int x, int y){
    //최상위 부모 찾아오기
    x = find(x);
    y = find(y);
    if(x== y){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }


}
