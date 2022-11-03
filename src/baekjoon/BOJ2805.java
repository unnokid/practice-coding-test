package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2805 {

  public static void main(String[] args) throws IOException {
    //백준 2805 나무 자르기

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int M = Integer.parseInt(s[1]);

    int[] trees = new int[N];

    String[] tree = br.readLine().split(" ");
    for (int i = 0; i <N ; i++) {
      trees[i] = Integer.parseInt(tree[i]);
    }
    Arrays.sort(trees);
    int height = trees[trees.length-1] -1;
    int total = 0;
    while(height >0){
      total = 0;
      for (int i = trees.length-1; i >=0; i--) {
        if(trees[i] > height){
          total+= trees[i] - height;
        }else{
          break;
        }
      }

      if(total >= M){
        break;
      }

      height--;
    }

    System.out.println(height);
  }
}
