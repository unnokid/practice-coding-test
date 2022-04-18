package leetcode;

import java.util.LinkedList;

public class KthSmallestElementinaBST {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(1,null,new TreeNode(2)),new TreeNode(4));
        int k;
        k=1;
        System.out.println(solution.kthSmallest(root,k));
    }

    static class Solution {
        public int kthSmallest(TreeNode root, int k) {
            LinkedList<TreeNode> stack = new LinkedList<>();

            while (true) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                k--;
                if (k == 0) return root.val;
                root = root.right;
            }
        }
    }

    static public class TreeNode {
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
