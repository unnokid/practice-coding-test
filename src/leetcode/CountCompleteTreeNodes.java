package leetcode;

public class CountCompleteTreeNodes {

  public static void main(String[] args) {
    class Solution {
      public int countNodes(TreeNode root) {

        if(root==null){
          return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);

      }
      class TreeNode {
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
}
