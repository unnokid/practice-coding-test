package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

  public static void main(String[] args) {
    Solution solution = new Solution();
  }

  static class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      Stack<TreeNode> stack = new Stack<>();

      TreeNode cur = root;
      while (cur != null || !stack.isEmpty()) {
        while (cur != null) {
          stack.push(cur);
          cur = cur.left;
        }
        cur = stack.pop();
        result.add(cur.val);
        cur = cur.right;
      }
      return result;
    }
  }

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

}
