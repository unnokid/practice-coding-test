package leetcode;

public class RemoveKDigits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num;
        int k;
        num = "1432219";
        k = 3;
        System.out.println(solution.removeKdigits(num,k));
        num = "10200";
        k = 1;
        System.out.println(solution.removeKdigits(num,k));
        num = "10";
        k = 2;
        System.out.println(solution.removeKdigits(num,k));
    }
    static class Solution {
        public String removeKdigits(String num, int k) {
            //숫자로된 양수 문자열을 줄때
            //k개 만큼 제거해서 가장 작게 만들기

            if(k ==0){
                return num;
            }

            if(num.length() <= k){
                return "0";
            }

            StringBuilder sb = new StringBuilder(num);

            for (int i = 0; i < k; i++) {
                int count =0;
                while(count < sb.length() -1 && sb.charAt(count) <= sb.charAt(count+1)){
                    count++;
                }
                sb.delete(count,count+1);
            }
            //앞에 0이 있으면 빼줘야함

            int start =0;
            while(start < sb.length()-1 && sb.charAt(start) == '0'){
                start++;
            }
            return sb.toString().substring(start);
        }
    }
}
