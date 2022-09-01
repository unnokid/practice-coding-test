package leetcode;

public class CountGoodNodesinBinaryTree {

  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode t1 = new TreeNode(3,new TreeNode(1,new TreeNode(3),null),new TreeNode(4,new TreeNode(1), new TreeNode(5)));
    System.out.println(solution.goodNodes(t1));
  }

  static class Solution {
    int count;
    public int goodNodes(TreeNode root) {
      count =0;
      int target = root.val;
      dfs(root,target);


      return count;
    }
    private void dfs(TreeNode cur, int target){
      if(cur.val >= target){
        count++;
        target = cur.val;
      }

      if(cur.left != null){
        dfs(cur.left,target);
      }

      if(cur.right != null){
        dfs(cur.right,target);
      }

    }
  }

  public static class TreeNode {

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
