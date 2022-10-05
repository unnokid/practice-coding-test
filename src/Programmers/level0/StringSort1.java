package Programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class StringSort1 {

  public static void main(String[] args) {

  }
  static class Solution {
    public int[] solution(String my_string) {
      List<Integer> list = new ArrayList<>();

      for (int i = 0; i <my_string.length() ; i++) {
        int target = my_string.charAt(i)-'0';
        if(target >=0 && target <10){
          list.add(target);
        }
      }


      return list.stream().mapToInt(i->i).sorted().toArray();
    }
  }
}
