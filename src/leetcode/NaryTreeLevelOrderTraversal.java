package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {

  public static void main(String[] args) {
    Solution solution = new Solution();

  }

  static class Solution {
    public List<List<Integer>> levelOrder(Node root) {
      List<List<Integer>> result = new ArrayList<>();
      bfs(root,0,result);
      return result;
    }
    void bfs(Node root, int level, List<List<Integer>> result){
      Queue<Node> queue = new LinkedList<>();

      if(root!=null){
        queue.add(root);
      }else{
        return;
      }

      if(result.isEmpty()){
        result.add(new ArrayList<>(Arrays.asList(root.val)));
      }else{
        if(result.size()< level+1){
          result.add(new ArrayList<>(Arrays.asList(root.val)));
        }else{
          result.get(level).add(root.val);
        }
      }

      for (Node next: queue.poll().children){
        bfs(next,level+1,result);
      }

    }
  }

    class Node {

      public int val;
      public List<Node> children;

      public Node() {
      }

      public Node(int _val) {
        val = _val;
      }

      public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
      }
    }
  }



