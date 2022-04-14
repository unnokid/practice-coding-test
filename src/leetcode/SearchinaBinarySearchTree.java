package leetcode;

public class SearchinaBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        int val = 2;
        System.out.println(solution.searchBST(root,val));
    }

    static class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if(root == null){
                return null;
            }

            if(root.val == val){
                return root;
            }else if(root.val > val){
                return searchBST(root.left,val);
            }else{
                return searchBST(root.right,val);
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
