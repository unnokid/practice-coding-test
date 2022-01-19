package leetcode;

import javax.swing.tree.TreeNode;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {

    }

    static class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            //2개의 이진 트리를 줌
            //각 자리에 맞게 트리노트를 합치라는 의미
            //재귀 각 값만 1쪽으로 몰아주고 계속돌리자

            //재귀를 돌릴때 그자리가 널이면 어떻할지?
            //그 나머지를 넘겨버린다
            if(root1 == null){
                return root2;
            }
            else if(root2 == null){
                return root1;
            }



            root1.val += root2.val;
            root1.left =mergeTrees(root1.left,root2.left);
            root1.right = mergeTrees(root1.right,root2.right);

            return root1;

        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
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
