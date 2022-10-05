package Programmers.level0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Babbling {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] s;
    s = new String[]{"ayayewoomawooma"};
    System.out.println(solution.solution(s));
    s = new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    System.out.println(solution.solution(s));
  }
  static class Solution {
    public int solution(String[] babbling) {
      int answer = 0;

      String[] temp = new String[]{"aya","ye","woo","ma"};

      for (int i = 0; i <babbling.length ; i++) {
        System.out.println("타켓:"+babbling[i] );
        boolean pass = true;
        for (int j = 0; j <4 ; j++) {
          if(babbling[i].contains(temp[j]+temp[j])){
            System.out.println("반복되서 탈락: "+temp[j]);
            pass =false;
            break;
          }else if(babbling[i].contains(temp[j])){
            System.out.println("추가: "+temp[j]);
          }
        }

        if(!pass){
          continue;
        }
        String s = babbling[i];
        for (int j = 0; j < 4; j++) {
          s = s.replaceAll(temp[j],"");
        }
        if(s.equals("")){
          System.out.println(babbling[i]+"추가됬음");
          answer++;
        }
      }


      return answer;
    }

  }
}
