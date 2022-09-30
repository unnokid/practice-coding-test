package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TheSkylineProblem {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] build;
    build = new int[][]{{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
    System.out.println(solution.getSkyline(build));
  }
  static class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
      List<List<Integer>> result = new ArrayList<>();
      List<int[]> height = new ArrayList<>();

      for (int[] build: buildings){
        height.add(new int[]{build[0],-build[2]});
        height.add(new int[]{build[1],build[2]});
      }

      Collections.sort(height, (a,b) ->{
        if(a[0] != b[0]){
          return  a[0] -b[0];
        }
        return a[1] - b[1];
      });

      Queue<Integer> pq = new PriorityQueue<>((a,b)-> (b-a));
      pq.offer(0);
      int before = 0;

      for (int[] h: height){
        if(h[1] <0){
          pq.offer(-h[1]);
        }else{
          pq.remove(h[1]);
        }
        int cur = pq.peek();
        if(before != cur){
          List<Integer> temp = new ArrayList<>();
          temp.add(h[0]);
          temp.add(cur);
          result.add(temp);
          before = cur;
        }
      }
      return result;


    }
  }

}
