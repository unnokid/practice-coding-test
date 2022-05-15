package leetcode;

public class DeepestLeavesSum {
    public static void main(String[] args) {

    }
    static class Solution {
        private int result = 0;
        private int level = 0;
        public int deepestLeavesSum(TreeNode root) {
            dfs(root, 0);
            return result;
        }
        void dfs(TreeNode root, int cur) {
            if (root == null) return;

            if (cur > level) {
                result = 0;
                level = cur;
            }
            if (cur == level) {
                result += root.val;
            }

            dfs(root.left, cur + 1);
            dfs(root.right, cur + 1);
        }
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
