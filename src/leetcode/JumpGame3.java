package leetcode;

public class JumpGame3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        int start;
        arr = new int[]{4,2,3,0,3,1,2};
        start = 5;
        System.out.println(solution.canReach(arr,start));
        arr = new int[]{4,2,3,0,3,1,2};
        start = 0;
        System.out.println(solution.canReach(arr,start));
    }
    static class Solution {
        static boolean answer;
        public boolean canReach(int[] arr, int start) {
            //음수가 아닌 정수 배열 arr
            //start 인덱스에서 시작하고
            //너가 i번째일때 넌 i+arr[i] 이동하거나 or i - arr[i]
            //0이 있는 값으로 갈 수 있는지
            boolean[] visit = new boolean[arr.length];
            int target = arr[start];
            //둘중하나만 되면 된다
            return dfs(arr,start-target,visit) || dfs(arr,start+ target,visit);
        }
        boolean dfs(int[] arr , int start,boolean[] visit){
            //인덱스 넘침
            if(start <0 || start>= arr.length){
                return false;
            }
            //0이면 성공
            if(arr[start] ==0){
                return true;
            }
            //방문한적있음
            if(visit[start]){
                return false;
            }
            visit[start] =true;
            int target = arr[start];

            boolean check = dfs(arr,start-target,visit) || dfs(arr,start+target,visit);
            return check;
        }


    }
}
