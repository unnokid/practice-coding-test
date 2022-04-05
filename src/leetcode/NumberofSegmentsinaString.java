package leetcode;

public class NumberofSegmentsinaString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "Hello, my name is John";
        System.out.println(solution.countSegments(s));
    }
    static class Solution {
        public int countSegments(String s) {

            int count =0;
            if(s.length() < 1){
                return 0;
            }

            String[] temp = s.split(" ");
            for (int i = 0; i <temp.length ; i++) {
                if(temp[i] !=""){
                    count++;
                }
            }


            return count;
        }
    }
}
