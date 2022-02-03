package leetcode;

import java.util.HashMap;

public class Sum4array2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //예시 넣기
    }
    static class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            //n길이의 4개의 배열을 줌
            //각 배열의 인덱스에서 한개씩 빼서 다 더했을때 0을 만드는 i j k l이 있다
            //그 조합의 방법의 개수를 return

            //4중 for문은 시간이 안됨
            //2개씩 묶어서 보는걸로 어떻게?
            //hashmap 이용
            HashMap<Integer, Integer> map = new HashMap<>();
            int count =0;

            for (int i = 0; i <nums1.length ; i++) {
                for (int j = 0; j <nums2.length ; j++) {
                    int sum = nums1[i] + nums2[j];
                    //만약에 그런값이 존재한다면
                    if(map.containsKey(sum)){
                        //그런숫자의 개수가 1개 더있다
                        map.put(sum,map.get(sum) +1);
                    }else{
                        map.put(sum,1);
                    }
                }
            }

            for (int i = 0; i < nums3.length; i++) {
                for (int j = 0; j < nums4.length; j++) {
                    int sum = nums3[i] + nums4[j];
                    //아까 저장했던 값이랑 더해야됨
                    //아까 저장했던 친구들 어떻게 찾을것인가
                    //아까 sum값 + 지금 sum값 =0
                    //부호만 바꾸어주면 다시 위에 sum값을 찾을수있음
                    if(map.containsKey(-1 *sum)){
                        //그리고 그 값이 여러개 일수도 있으니까 값가져와서 count하기
                        count += map.get(-1*sum);
                    }
                }
            }


            return count;
        }
    }
}
