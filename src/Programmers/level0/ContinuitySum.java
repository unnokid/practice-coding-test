package Programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuitySum {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int num;
    int total;
    num =3;
    total =12;
    System.out.println(Arrays.toString(solution.solution(num, total)));
    num =5;
    total =15;
    System.out.println(Arrays.toString(solution.solution(num, total)));
    num =4;
    total =14;
    System.out.println(Arrays.toString(solution.solution(num, total)));
    num =4;
    total =14;
    System.out.println(Arrays.toString(solution.solution(num, total)));
  }
  static class Solution {
    public int[] solution(int num, int total) {
      int[] answer = new int[num];

      if(num %2 ==1){
        for (int i = 0; i <answer.length ; i++) {
          answer[i] = (total/num)-((num-1)/2)+i;
        }
      }else{
        int t = total/num;
        List<Integer> list = new ArrayList<>();
        list.add(t);
        list.add(t+1);
        int plus = 1;
        int count = (num-2)/2;
        while(count>0){
          list.add(t-plus);
          list.add(t+plus+1);
          plus++;
          count--;
        }
        return list.stream().mapToInt(i->i).sorted().toArray();
      }

      return answer;
    }
  }
}
