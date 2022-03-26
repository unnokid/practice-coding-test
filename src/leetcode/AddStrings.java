package leetcode;

import java.math.BigInteger;

public class AddStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String nums1;
        String nums2;
        nums1="11";
        nums2="123";
        System.out.println(solution.addStrings(nums1,nums2));
        nums1="456";
        nums2="77";
        System.out.println(solution.addStrings(nums1,nums2));
    }
    static class Solution {
        public String addStrings(String num1, String num2) {
            //문자열로 주어진 num1,nums2를 더해서 문자열로 만들기
            //단순한 변환으론 Integer의 범위를 넘어섬

            int target=0;
            int i=num1.length()-1;
            int j=num2.length()-1;
            StringBuilder sb = new StringBuilder();
            while(i>=0 && j>=0){
                int sum=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+target;
                target=sum/10;
                sb.append(sum%10);
                i--;
                j--;
            }

            while(i>=0){
                int sum=(num1.charAt(i)-'0')+target;
                target=sum/10;
                sb.append(sum%10);
                i--;
            }

            while(j>=0){
                int sum=(num2.charAt(j)-'0')+target;
                target=sum/10;
                sb.append(sum%10);
                j--;
            }

            while(target!=0){
                int sum=target;
                target=sum/10;
                sb.append(sum%10);
            }

            return sb.reverse().toString();
        }
    }
}
