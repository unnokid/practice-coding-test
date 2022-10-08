package Programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class Mode {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int[] array) {
      int answer = 0;
      boolean pass = true;
      Map<Integer,Integer>map = new HashMap<>();

      for (int i = 0; i <array.length ; i++) {
        map.put(array[i],map.getOrDefault(array[i],0)+1);
      }
      int max = 0;
      for (int key :map.keySet()){
        int count = map.get(key);
        if(count == max){
          pass =false;
        }
        if(count > max){
          max = count;
          answer = key;
          pass =true;
        }
      }



      return pass?answer:-1;
    }
  }
}
