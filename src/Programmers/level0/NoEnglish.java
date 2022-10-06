package Programmers.level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NoEnglish {

  public static void main(String[] args) {

  }
  static class Solution {
    public long solution(String numbers) {
      StringBuilder sb = new StringBuilder();
      String[] map = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
      Set<String> set = new HashSet<>(Arrays.asList(map));
      String temp = "";
      for (int i = 0; i <numbers.length() ; i++) {
        temp+=numbers.charAt(i);
        if(set.contains(temp)){
          for (int j = 0; j <map.length ; j++) {
            if(map[j].equals(temp)){
              sb.append(j);
              temp ="";
              break;
            }
          }
        }

      }
      return Long.parseLong(sb.toString());
    }
  }
}
