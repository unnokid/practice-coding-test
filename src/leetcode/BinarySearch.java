package leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums;
        int target;

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target =3;
        System.out.println(solution.search(nums,target));
        nums = new int[]{-1, 0, 3, 5, 9, 12,15};
        target =3;
        System.out.println(solution.search(nums,target));
        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target =2;
        System.out.println(solution.search(nums,target));
        nums = new int[]{-1, 0, 3, 5, 9, 12,15};
        target =2;
        System.out.println(solution.search(nums,target));
        nums = new int[]{5};
        target =5;
        System.out.println(solution.search(nums,target));
        nums = new int[]{2,5};
        target =2;
        System.out.println(solution.search(nums,target));
    }

}
class Solution {
    public int search(int[] nums, int target) {
        int answer = -1;
        //정렬된 배열이 주어짐
        //target이 존재한다면 그 인덱스 return
        //존재하지 않는다면 -1 return
        //반드시 O(log n) 알고리즘을 사용해라
        int beforeStart =0;
        int beforeEnd =0;

        int start =0;
        int end = nums.length;
        int length = end - start;

        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }
            else{
                return -1;
            }
        }

        length/=2;
        while(true){
            if(start == beforeStart && end == beforeEnd ){
                break;
            }

            if(nums[length] == target){
                answer = length;
                break;
            }
            else if(nums[length] > target){
                //인덱스가 내려가야됨
                beforeEnd = end;
                beforeStart = start;
                end = length;
                length = (length+start)/2;

            }
            else{
                //인덱스가 올라가야됨
                beforeEnd = end;
                beforeStart = start;
                start = length;
                length = (length+end)/2;
            }
        }
        return answer;
    }
}