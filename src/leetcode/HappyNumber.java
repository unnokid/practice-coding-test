package leetcode;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 19;
        System.out.println(solution.isHappy(n));
        n= 7;
        System.out.println(solution.isHappy(n));
        n= 2;
        System.out.println(solution.isHappy(n));
    }
    static class Solution {
        public boolean isHappy(int n) {
            //happy number인지 판단 return
            //각 자리수를 제곱해서 더한 값이 1이 되면 happy number임
            boolean result = true;

            HashSet<Integer> set = new HashSet<>();
            set.add(n);
            int sum;
            while(true){
                if(n ==1){
                    break;
                }
                sum =0;
                //각 자리수 제곱을 더해서 sum으로 모으기
                while(n != 0){
                    sum+=Math.pow(n%10,2);
                    n/=10;
                }
                n = sum;
                //전에 계산했던 n값인지 확인하기
                if(set.contains(n)){
                    result =false;
                    break;
                }
                set.add(n);
            }
            return result;
        }
    }
}
