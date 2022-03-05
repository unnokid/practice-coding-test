package leetcode;

public class Maximum69Number {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=9669;
        System.out.println(solution.maximum69Number(n));
        n=9996;
        System.out.println(solution.maximum69Number(n));
    }
    static class Solution {
        public int maximum69Number (int num) {
            //num 최댓값 10000 ,69로만 이루어지기 때문에 9999 최대값
            int temp = num;
            int idx =1000;
            while(temp >0){
                if(temp/idx == 6){

                    num+=3*idx;
                    break;
                }
                temp=temp%idx;
                idx/=10;
            }

            return num;
        }
    }
}
