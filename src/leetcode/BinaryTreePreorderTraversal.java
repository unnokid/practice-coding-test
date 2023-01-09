package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {

    }
    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            check(root, list);
            return list;
        }
        void check(TreeNode node,List<Integer> list){
            if(node == null){
                return;
            }
            list.add(node.val);
            check(node.left,list);
            check(node.right,list);
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
