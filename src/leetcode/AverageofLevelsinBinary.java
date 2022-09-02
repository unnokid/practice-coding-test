package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinary {

  public static void main(String[] args) {
    Solution solution = new Solution();
  }
  static class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
      LinkedList<Double> list = new LinkedList<>();
      Queue<TreeNode> queue = new LinkedList<>();

      if (root == null) {
        return list;
      }
      queue.add(root);
      while (!queue.isEmpty()) {
        int n = queue.size();
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
          TreeNode node = queue.poll();
          sum += node.val;

          //왼쪽 오른쪽
          if (node.left != null) {
            queue.offer(node.left);
          }
          if (node.right != null) {
            queue.offer(node.right);
          }
        }
        list.add(sum / n);
      }
      return list;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

  }
}
