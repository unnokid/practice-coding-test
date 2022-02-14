package leetcode;

public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode r = new TreeNode(2);
        TreeNode root = new TreeNode(1,null,r);
        System.out.println(solution.maxDepth(root));
        /*root = new TreeNode();
        System.out.println(solution.maxDepth(root));*//*
        TreeNode no1 = new TreeNode(5);
        TreeNode no2 = new TreeNode(4);
        TreeNode no3 = new TreeNode(2,no2,no1);
        TreeNode no4 = new TreeNode(3);
        TreeNode root = new TreeNode(1,no3,no4);
        System.out.println(solution.maxDepth(root));*//*
        TreeNode no1 = new TreeNode(15);
        TreeNode no2 = new TreeNode(7);
        TreeNode no3 = new TreeNode(20,no1,no2);
        TreeNode no4 = new TreeNode(9);
        TreeNode root = new TreeNode(3,no4,no3);
        System.out.println(solution.maxDepth(root));*/

    }

    static class Solution {
        public int answer =0;
        public int maxDepth(TreeNode root) {
            //이진 트리 root을 준다
            //가장 깊은 길이를 return

            //내려가면서 그값이 null이 아니면 count++
            find(root ,0);
            return answer;
        }
        public void find(TreeNode root, int count){
            if(root == null){
                answer = Math.max(count,answer);
                return;
            }
            find(root.left,count+1);
            find(root.right,count+1);
        }
    }

    static class TreeNode {
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
