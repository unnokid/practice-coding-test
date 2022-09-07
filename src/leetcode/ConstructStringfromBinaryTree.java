package leetcode;

public class ConstructStringfromBinaryTree {

  public static void main(String[] args) {
    Solution solution = new Solution();

  }

  static class Solution {
    String result ="";
    public String tree2str(TreeNode root) {
      if(root.right == null && root.left == null){
        return String.valueOf(root.val);
      }

      checker(root);
      return result;

    }
    void checker(TreeNode root){
      if(root==null){
        return;
      }
      //root값 더하기
      result+=root.val;

      //값이 존재하면 괄호 생성
      if(root.left != null || root.right != null){
        result+="(";
        checker(root.left);
        result+=")";
        if(root.right != null){
          result+="(";
          checker(root.right);
          result+=")";
        }
      }

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
