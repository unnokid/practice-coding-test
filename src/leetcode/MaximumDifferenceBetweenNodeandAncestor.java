package leetcode;

public class MaximumDifferenceBetweenNodeandAncestor {

    public static void main(String[] args) {

    }
    static class Solution {
        int max =0;
        public int maxAncestorDiff(TreeNode root) {

            if(root == null){
                return max;
            }

            helper(root,root.val,root.val);
            return max;
        }
        private void helper(TreeNode root, int min_v, int max_v){
            max = Math.max(max,Math.abs(min_v-max_v));

            if(root.left != null){
                helper(root.left, Math.min(min_v,root.left.val),Math.max(max_v, root.left.val));
            }

            if(root.right != null){
                helper(root.right, Math.min(min_v,root.right.val),Math.max(max_v, root.right.val));
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
}
