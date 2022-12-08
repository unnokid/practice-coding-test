package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public static void main(String[] args) {

    }
    static class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            check(root1,list1);
            check(root2,list2);

            if(list1.size() != list2.size()){
                return false;
            }
            return list1.equals(list2);
        }
        private void check(TreeNode root, List<Integer> list){
            if(root == null){
                return ;
            }

            check(root.left,list);
            if(root.left == null && root.right == null){
                list.add(root.val);
            }
            check(root.right,list);
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
