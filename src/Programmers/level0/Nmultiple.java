package Programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class Nmultiple {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int n, int[] numlist) {
      List<Integer> result = new ArrayList<>();

      for (int i = 0; i <numlist.length ; i++) {
        if(numlist[i]%n == 0){
          result.add(numlist[i]);
        }
      }


      return result.stream().mapToInt(i->i).toArray();
    }
  }
}
