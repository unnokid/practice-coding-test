package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaximumWidthofBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t = new TreeNode(1,new TreeNode(3,new TreeNode(5),new TreeNode(3)),new TreeNode(2,null,new TreeNode(9)));
        System.out.println(solution.widthOfBinaryTree(t));
    }

    static class Solution {
        public int widthOfBinaryTree(TreeNode root) {
            List<Integer> list = new ArrayList<>();

            //전체 순회
            int answer = dfs(root,0,1,list);
            return answer;
        }
        int dfs(TreeNode root, int level,int target, List<Integer> list){

            if(root == null){
                return 0;
            }
            if(level == list.size()){
                list.add(target);
            }

            int cur = target-list.get(level)+1;
            int left = dfs(root.left,level+1,2*target,list);
            int right = dfs(root.right,level+1,2*target+1,list);

            return Math.max(cur,Math.max(left,right));
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
