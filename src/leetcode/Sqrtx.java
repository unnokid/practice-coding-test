package leetcode;

public class Sqrtx {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x;
        x=4;
        System.out.println(solution.mySqrt(x));
        x=8;
        System.out.println(solution.mySqrt(x));
    }
    static class Solution {
        public int mySqrt(int x) {
            //정수 x를 줄 때
            //어떤수를 제곱했을때 x를 만들수 있는지 정수로 return

            long target=1;
            while(true){
                if(target*target == x){
                    return (int) target;
                }
                else if(target*target > x){
                    return (int) target-1;
                }
                target++;
            }

        }
    }
}
