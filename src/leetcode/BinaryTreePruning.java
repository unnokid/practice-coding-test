package leetcode;

public class BinaryTreePruning {

  public static void main(String[] args) {
    Solution solution = new Solution();

  }

  static class Solution {
    public TreeNode pruneTree(TreeNode root) {

      if(root==null){
        return null;
      }
      root.left=pruneTree(root.left);
      root.right=pruneTree(root.right);
      if(root.left==null && root.right==null && root.val==0){
        return null;
      }

      return root;
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
