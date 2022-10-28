package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {

  public static void main(String[] args) throws IOException {
    //백준 1316 그룹 단어 체커

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count =0;
    for (int i = 0; i < N; i++) {
      String target = br.readLine();
      count+= check(target);
    }
    System.out.println(count);
  }
  private static int check(String target){
    boolean[] map = new boolean[26];
    int pre = 0;
    for (int i = 0; i <target.length() ; i++) {
      int cur = target.charAt(i);

      if(pre != cur){

        if(!map[cur-'a']){
          map[cur-'a'] = true;
          pre = cur;
        }else{
          return 0;
        }

      }

    }
    return 1;
  }
}
