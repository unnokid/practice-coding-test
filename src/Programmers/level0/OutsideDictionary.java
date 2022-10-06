package Programmers.level0;

public class OutsideDictionary {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] spell;
    String[] dic;
    spell = new String[]{"p","o","s"};
    dic = new String[]{"sod", "eocd", "qixm", "adio", "soo"};
    System.out.println(solution.solution(spell,dic));
  }

  static class Solution {

    public int solution(String[] spell, String[] dic) {
      int[] map = new int[26];

      for (int i = 0; i < spell.length; i++) {
        map[spell[i].charAt(0) - 'a']++;
      }

      for (int i = 0; i < dic.length; i++) {
        String temp = dic[i];
        boolean[] visit = new boolean[26];
        if(dic[i].length() != spell.length){
          continue;
        }
        int count =0;
        for (int j = 0; j < temp.length(); j++) {
          if(map[temp.charAt(j)-'a'] > 0&& !visit[temp.charAt(j)-'a']){
            visit[temp.charAt(j)-'a'] = true;
            count++;
          }
        }
        if(count == spell.length){

          System.out.println(dic[i]+"존재함");
          return 1;
        }
      }

      return 2;
    }
  }
}
