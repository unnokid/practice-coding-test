package leetcode;

public class RectangleOverlap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] rect1;
        int[] rect2;
        rect1 = new int[]{0,0,2,2};
        rect2 = new int[]{1,1,3,3};
        System.out.println(solution.isRectangleOverlap(rect1,rect2));
        rect1 = new int[]{0,0,2,2};
        rect2 = new int[]{1,0,2,1};
        System.out.println(solution.isRectangleOverlap(rect1,rect2));
    }
    static class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

            //2개의 직사각형 배열을 줌
            //두개가 겹치는지 여부 return

            if(rec1[2] >rec2[0] &&
               rec1[1] <rec2[3] &&
               rec1[3] >rec2[1] &&
               rec1[0] <rec2[2] ){
                return true;
            }
            else{
                return false;
            }



        }
    }
}
