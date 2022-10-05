package Programmers.level0;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowel {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String my_string) {
      StringBuilder sb = new StringBuilder();
      Set<Character> set = new HashSet<>();
      set.add('a');
      set.add('e');
      set.add('i');
      set.add('o');
      set.add('u');


      for (int i = 0; i <my_string.length() ; i++) {
        if(set.contains(my_string.charAt(i))){
          continue;
        }else{
          sb.append(my_string.charAt(i));
        }
      }

      return sb.toString();
    }
  }
}
