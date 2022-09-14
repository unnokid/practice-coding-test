package leetcode;

public class PseudoPalindromicPathsinaBinaryTree {

  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(2, new TreeNode(3, new TreeNode(3),new TreeNode(1)),new TreeNode(1, null, new TreeNode(1)));
  }
  static class Solution {
    int result;
    public int pseudoPalindromicPaths (TreeNode root) {
      result = 0;
      int[] map = new int[10];
      check(root, map);
      return result;

    }
    void check(TreeNode root, int[] map){
      if(root == null){
        return;
      }

      map[root.val]+=1;

      if(root.left == null && root.right == null){
        if(isPalindrome(map)){
          result++;
        }
      }
      check(root.left,map);
      check(root.right,map);
      map[root.val]--;

    }
    boolean isPalindrome(int[] map){
      int count =0;
      for (int i = 0; i <=9 ; i++) {
        if(map[i] %2 !=0){
          count++;
        }

        if(count >= 2){
          return  false;
        }
      }
      return true;
    }
  }
  static public class TreeNode {
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
