package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionbyHeight {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] people;
    people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
    System.out.println(solution.reconstructQueue(people));
  }
  static class Solution {
    public int[][] reconstructQueue(int[][] people) {
      //사람의 배열 주어짐
      //키, 본인보다 키큰사람의 수
      //키로 내림차순 정렬하고 키가 같다면 본인보다 키가큰사람의 숫자가 큰순서로

      int[][] result = new int[people.length][2];
      //키는 내림차순, 나보다큰사람은 오름차순
      Arrays.sort(people, (a,b)-> a[0] == b[0] ? a[1] -b[1] : b[0] - a[0]);
      System.out.println(Arrays.deepToString(people));

      List<int[]> list = new ArrayList<>();
      for (int i = 0; i < result.length ; i++) {
        int[] temp = people[i];
        //자기보다 큰사람의 수 순서대로 들어가야댐
        list.add(temp[1],temp);
      }
      for (int i = 0; i < result.length ; i++) {
        // list에 들어간 순서대로 먼저 배치하기
        result[i] = list.get(i);
      }
      return result;
    }
  }
}
