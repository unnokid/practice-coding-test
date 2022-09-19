package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2961 {

  static int[] S;
  static int[] B;
  static int result = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException {
    //백준 2961번 도영이가 만든 맛있는 음식

    //신맛은 곱하기 쓴맛은 합

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    S = new int[T];
    B = new int[T];

    for (int i = 0; i < T; i++) {
      String[] SB = br.readLine().split(" ");
      S[i] = Integer.parseInt(SB[0]);
      B[i] = Integer.parseInt(SB[1]);
    }
    make(0,0,1,0,T);

    System.out.println(result);
  }
  static void make(int count, int idx, int Ss, int Sb, int T){
    if(T == idx){
      if(count != 0){
        //가장 차이가 적게 나는 return
        result = Math.min(result, Math.abs(Ss- Sb));
      }
      return ;
    }

    //내가 재료를 넣었는가 차이에 대한 2가지 분기점
    make(count, idx+1, Ss,Sb,T);
    make(count+1, idx+1, Ss*S[idx], Sb+B[idx],T);

  }
}
