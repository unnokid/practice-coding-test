package leetcode;

public class PathSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int targetsum = 5;
        TreeNode no1 = new TreeNode(2);
        TreeNode no2 = new TreeNode(3);
        TreeNode root = new TreeNode(1,no1,no2);
        System.out.println(solution.hasPathSum(root,targetsum));
        TreeNode ro = new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))));
        targetsum = 22;
        System.out.println(solution.hasPathSum(ro,targetsum));
        TreeNode roo = new TreeNode(1,new TreeNode(2),null);
        targetsum =1;
        System.out.println(solution.hasPathSum(roo,targetsum));
    }

    static class Solution {
        public boolean answer= false;
        public int length= 0;
        public boolean hasPathSum(TreeNode root, int targetSum) {
            //root가 시작인 이진트리를 줌
            // root부터 leaf 까지의 합이 targetSum인게 존재하는지 return

            if(root == null){
                return answer;
            }

            if(root.left == null && root.right == null && targetSum - root.val ==0){
                answer = true;
                return answer;
            }
            else{
                return (hasPathSum(root.left,targetSum-root.val)
                        || hasPathSum(root.right,targetSum-root.val));
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
