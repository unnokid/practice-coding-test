package Programmers.level0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuccessLogin {

  public static void main(String[] args) {

  }
  static class Solution {
    public String solution(String[] id_pw, String[][] db) {
      Map<String, List<String>> map = new HashMap<>();

      for (int i = 0; i <db.length ; i++) {
        if(!map.containsKey(db[i][0])){
          List<String> temp = new ArrayList<>();
          temp.add(db[i][1]);
          map.put(db[i][0],temp);
        }else{
          List<String> strings = map.get(db[i][0]);
          strings.add(db[i][1]);
        }
      }

      if(!map.containsKey(id_pw[0])){
        return "fail";
      }else if(map.get(id_pw[0]).contains(id_pw[1])){
        return "login";
      }else{
        return "wrong pw";
      }
    }
  }
}
