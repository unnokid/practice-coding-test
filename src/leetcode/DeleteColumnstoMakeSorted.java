package leetcode;

public class DeleteColumnstoMakeSorted {

    public static void main(String[] args) {

    }
    static class Solution {
        public int minDeletionSize(String[] strs) {
            int count =0;

            for (int i = 0; i <strs[0].length() ; i++) {
                char ch= strs[0].charAt(i);
                for (String s : strs){
                    if(s.charAt(i) < ch){
                        count++;
                        break;
                    }
                    ch = s.charAt(i);
                }
            }
            return count;
        }
    }
}
