package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTest {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] survey;
    int[] choices;
    survey = new String[]{"AN", "CF", "MJ", "RT", "NA"};
    choices = new int[]{5, 3, 2, 7, 5};
    System.out.println(solution.solution(survey, choices));

  }

  static class Solution {

    public String solution(String[] survey, int[] choices) {
      //choices 1~7 유형
      //매우 비동의, 비동의, 약간 비동의, 모르겠음, 약간 동의, 동의, 매우 동의
      Map<Character, Integer> map = new HashMap<>();
      char[] type = {'R','T','C','F','J','M','A','N'};
      int[] score = new int[8];
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < 8; i++) {
        map.put(type[i],i);
      }

      for (int i = 0; i <survey.length ; i++) {
        char[] arr=survey[i].toCharArray();
        switch (choices[i]){
          case 1 : score[map.get(arr[0])]+=3;
            break;
          case 2 : score[map.get(arr[0])]+=2;
            break;
          case 3 : score[map.get(arr[0])]+=1;
            break;
          case 4 : break;
          case 5 : score[map.get(arr[1])]+=1;
            break;
          case 6 : score[map.get(arr[1])]+=2;
            break;
          case 7 : score[map.get(arr[1])]+=3;
            break;
          default : break;
        }
      }

      for (int i = 0; i <8 ; i+=2) {
        if(score[i]>score[i+1])
          sb.append(type[i]);
        else if(score[i]==score[i+1]){
          if(type[i]<type[i+1])
            sb.append(type[i]);
          else
            sb.append(type[i+1]);
        }
        else
          sb.append(type[i+1]);
      }


      return sb.toString();
    }
  }
}
