package leetcode;

public class BrokenCalculator {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int start;
        int target;
        start=2;
        target=3;
        System.out.println(solution.brokenCalc(start,target));
        start=5;
        target=8;
        System.out.println(solution.brokenCalc(start,target));
        start=3;
        target=10;
        System.out.println(solution.brokenCalc(start,target));
    }
    static class Solution {
        public int brokenCalc(int startValue, int target) {
            //2를 곱하거나, -1 를 해서 target숫자에 도달할 수 있는 최소횟수

            int count =0;

            while(target > startValue){
                if(target%2==0){
                    target/=2;
                }else{
                    target++;
                }
                count++;
            }

            //8 5 같은 경우 4가 되면서 끝남 그 차이를 더해줘야함
            return count+startValue-target;
        }
    }
}
