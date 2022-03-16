package leetcode;

public class LongestTurbulentSubarray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        arr = new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9};
        System.out.println(solution.maxTurbulenceSize(arr));
        arr = new int[]{4, 8, 12, 16};
        System.out.println(solution.maxTurbulenceSize(arr));
    }

    static class Solution {
        public int maxTurbulenceSize(int[] arr) {
            //배열을 줄때 작았다 커졋다 할 수 있는 최대의 길이


            int up = 1;
            int down = 1;
            int answer = 1;
            for (int i = 1; i < arr.length; i++) {
                //내려가기
                if (arr[i] > arr[i - 1]) {
                    up = down + 1;
                    down = 1;
                }
                //올라가기
                else if (arr[i] < arr[i - 1]) {
                    down = up + 1;
                    up = 1;
                }
                //둘이 같을경우 리셋
                else {
                    up = 1;
                    down = 1;
                }
                System.out.println(answer+"answer");
                answer = Math.max(answer, Math.max(up, down));
            }

            return answer;
        }
    }
}
