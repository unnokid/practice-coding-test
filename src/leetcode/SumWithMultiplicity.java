package leetcode;

import java.util.Arrays;

public class SumWithMultiplicity {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        int target;
        arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        target = 8;
        System.out.println(solution.threeSumMulti(arr, target));
    }

    static class Solution {
        public int threeSumMulti(int[] arr, int target) {
            // i j k 를 다 더했을때 target이 되는 경우의 수
            int answer = 0;
            int MOD = 1_000_000_007;
            int count[] = new int[101];

            for (int i = 0; i <arr.length ; i++) {
                count[arr[i]]++;
            }
            for (int i = Math.min(target, 100); i >=0 ; i--) {
                if (count[i] ==0){
                    continue;
                }

                for (int j = Math.min(target - i, 100); j >=0; j--) {
                    int k = Math.min(target - i - j, 100);

                    //0 이면 이상함
                    if(count[j] ==0 || count[k] ==0 || !(i>=j && j>=k)){
                        continue;
                    }

                    //각 3개가 다를때, 2개가 같을때, 3개가 같을때 조합의 개념으로 개수 접근
                    if(i != j && j != k){
                        answer += (count[i]*count[j]*count[k])%MOD;
                    }else if(i == j && j !=k && count[i]>=2){
                        answer += (count[i]*(count[j]-1)/2*count[k])%MOD;
                    }else if(i != j && j == k && count[j]>=2){
                        answer += (count[i]*count[j]*(count[k]-1)/2)%MOD;
                    }else if(i == j && j == k && count[i]>=3){
                        double temp = ((count[i]-1)%MOD)*((count[j]-2)%MOD)*(count[k]/6.0%MOD);
                        answer+= temp%MOD;
                    }
                }
            }

            return answer;
        }
    }
}
