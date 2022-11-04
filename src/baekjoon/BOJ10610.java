package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ10610 {

  public static void main(String[] args) throws IOException {
    //백준 10610 30

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();

    //30의 배수가 되기 위해선 조건
    // 3의 배수
    // 0의 존재

    List<Integer> list = new ArrayList<>();
    boolean zero = false;
    int total =0;

    for (int i = 0; i <N.length() ; i++) {
      int target = N.charAt(i)-'0';
      if(target ==0){
        zero = true;
      }
      total += target;
      list.add(target);
    }

    if(total%3==0 && zero){
      Collections.sort(list, Collections.reverseOrder());

      for (int i = 0; i <list.size() ; i++) {
        System.out.print(list.get(i));
      }
    }else{
      System.out.println(-1);
    }


  }
}
