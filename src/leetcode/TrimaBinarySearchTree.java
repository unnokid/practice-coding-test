package leetcode;

public class TrimaBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(0),new TreeNode(2));
        int low;
        int high;
        low=1;
        high=2;
        System.out.println(solution.trimBST(root,low,high));
    }

    static class Solution {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null){
                return root;
            }
            if (root.val > high) {
                return trimBST(root.left, low, high);
            }
            if (root.val < low){
                return trimBST(root.right, low, high);
            }

            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            return root;
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
