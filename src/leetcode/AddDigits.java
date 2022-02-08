package leetcode;

public class AddDigits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num;
        num =38;
        System.out.println(solution.addDigits(num));
    }
    static class Solution {
        public int addDigits(int num) {

            //정수을 줌
            //그 정수의 자릿수들 계속 더해서 한자리 남을때 까지 반복해서 return

            int sum =0;
            while(num >= 10){
                //계속 10으로 나눠서 다 더하기
                sum=0;
                while(num/10 > 0){
                    sum += num%10;
                    num = num /10;
                }
                sum+=num;
                num = sum;
            }
            return num;
        }
    }
}
