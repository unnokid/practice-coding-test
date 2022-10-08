package Programmers.level0;

import java.util.HashSet;
import java.util.Set;

public class Factorization {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(int n) {
      Set<Integer> set = new HashSet<>();
      for (int i = 2; i <= Math.sqrt(n) ; i++) {
        while(n%i ==0){
          set.add(i);
          n/=i;
        }
      }

      if(n !=1){
        set.add(n);
      }

      return set.stream().mapToInt(i->i).sorted().toArray();
    }
  }
}
