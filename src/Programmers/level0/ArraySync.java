package Programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class ArraySync {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(String[] s1, String[] s2) {
      int answer = 0;
      Map<String,Integer> map = new HashMap<>();
      for (int i = 0; i <s1.length ; i++) {
        map.put(s1[i],0);
      }

      for (int i = 0; i <s2.length ; i++) {
        if(!map.containsKey(s2[i])){
          continue;
        }else{
          answer++;
        }
      }
      return answer;
    }
  }
}
