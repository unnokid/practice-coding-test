package Programmers.level1;

import java.util.Arrays;

public class Removemin {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        arr = new int[]{4,3,2,1};
        System.out.println(Arrays.toString(solution.solution(arr)));
        arr = new int[]{10};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
    static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};

            //배열하나를 줌
            //가장 작은수를 제거한 배열을 return
            //만약 비게 된다면 -1를 채워넣고 return

            boolean check=false;
            int min =arr[0];
            int count =0;
            if(arr.length ==1 )
            {
                return answer = new int[]{-1};
            }

            for(int i=1;i<arr.length;i++)
            {
                if(min > arr[i])
                {
                    min = arr[i];
                }
            }
            answer = new int[arr.length-1];
            for(int i=0;i< answer.length;i++)
            {
                if(arr[i]==min){
                    count++;
                    answer[i] = arr[count];
                    check= true;
                    continue;
                }
                if(check){
                    answer[i] = arr[++count];
                }
                else
                    answer[i] = arr[count++];

            }

            return answer;
        }
    }
}
