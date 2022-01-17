package Programmers.level1;

public class MakePrime {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{1,2,3,4};
        System.out.println(solution.solution(nums));
        nums = new int[]{1,2,7,6,4};
        System.out.println(solution.solution(nums));
    }
    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            //주어진 배열에서 3개의 수를 더했을때 소수가 되는 경우의 개수 return

            //중복된 숫자 없음
            //제한사항이 숫자의 개수는 3<=x <=50 이므로 for문 가능
            for(int target1=0;target1<nums.length;target1++)
            {
                for(int target2=target1+1;target2<nums.length;target2++)
                {
                    for(int target3=target2+1;target3<nums.length;target3++)
                    {
                        if(Primecheck(nums[target1]+nums[target2]+nums[target3])){
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }
        boolean Primecheck(int sum)
        {

            for(int i=2;i<sum;i++){
                //소수는 1과 자기자신으로만 나눠지니까 2부터 자기전까지
                if(sum % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
