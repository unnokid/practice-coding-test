package leetcode;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1;
        String s2;
        s1="1.01";
        s2="1.001";
        System.out.println(solution.compareVersion(s1,s2));
    }
    static class Solution {
        public int compareVersion(String version1, String version2) {
            String[] arr1 = version1.split("\\.");
            String[] arr2 = version2.split("\\.");

            
            //arr1 과 arr2 로 .비교
            int count=0;
            while(count<arr1.length || count<arr2.length){
                if(count<arr1.length && count<arr2.length){
                    if(Integer.parseInt(arr1[count]) < Integer.parseInt(arr2[count])){
                        return -1;
                    }else if(Integer.parseInt(arr1[count]) > Integer.parseInt(arr2[count])){
                        return 1;
                    }
                } else if(count<arr1.length){
                    if(Integer.parseInt(arr1[count]) != 0){
                        return 1;
                    }
                } else if(count<arr2.length){
                    if(Integer.parseInt(arr2[count]) != 0){
                        return -1;
                    }
                }

                count++;
            }

            return 0;
        }
    }
}
