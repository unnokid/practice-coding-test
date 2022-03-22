package leetcode;

public class SmallestStringWithAGivenNumericValue {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int k;
        n=3;
        k=27;
        System.out.println(solution.getSmallestString(n,k));
        n=5;
        k=73;
        System.out.println(solution.getSmallestString(n,k));
        n=2;
        k=40;
        System.out.println(solution.getSmallestString(n,k));
    }
    static class Solution {
        public String getSmallestString(int n, int k) {
            //알파벳으로 표현하는데
            //a는 1 b는 2 c는 3
            //n개의 알파벳으로 k숫자를 표현

            //n개의 aaaaa 배열
            int total = k -n;
            int count =0;
            StringBuilder sb= new StringBuilder();
            while(total> 25){
                count++;
                total-=25;
            }

            for (int i = 0; i < n; i++) {
                char target = 'a';
                if(count ==0&& i == n-1){
                    target+=total;
                }
                else if(count >0 && i >= n-1-count){
                    target+=total;
                    total =25;
                }
                sb.append(target);
            }
            return sb.toString();
        }
    }
}
