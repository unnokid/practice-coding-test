package Programmers.level2;

import java.util.PriorityQueue;

public class Scovile {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] scovile;
        int K;
        scovile = new int[]{1,2,3,9,10,12};
        K = 7;
        System.out.println(solution.solution(scovile,K));
    }
    static class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;

            //모든 음식을 K이상으로 만들고자함
            // 섞은음식 = 가장 작은 수 + (두번째로 작은수*2)
            //모든 음식의 지수가 K이상으로 만들려고할때 섞어야할 최소 횟수 return

            PriorityQueue<Integer> heap = new PriorityQueue<>();

            //우선순위큐 사용
            for (int i = 0; i < scoville.length; i++) {
                heap.add(scoville[i]);
            }

            //모든 지수가 K보다 높아져야함
            while(heap.peek() <K){
                if(heap.size() < 2){
                    return -1;
                }
                int a = heap.poll();
                int b = heap.poll();

                //만드는 공식 result
                int result = a + b*2;
                heap.add(result);
                answer++;
            }
            return answer;
        }
    }
}
