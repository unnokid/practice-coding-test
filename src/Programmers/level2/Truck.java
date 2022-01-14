package Programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int bridge_length;
        int weight;
        int[] truck_weights;
        bridge_length = 2;
        weight = 10;
        truck_weights = new int[]{7,4,5,6};
        System.out.println(solution.solution(bridge_length,weight,truck_weights));
        bridge_length = 100;
        weight = 100;
        truck_weights = new int[]{10};
        System.out.println(solution.solution(bridge_length,weight,truck_weights));
        bridge_length = 100;
        weight = 100;
        truck_weights = new int[]{10,10,10,10,10,10,10,10,10,10};
        System.out.println(solution.solution(bridge_length,weight,truck_weights));
    }
    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            //bridge_length 는 트럭이 지날때 필요한 시간
            //weight는 다리가 버틸수있는 무게량
            //truck_weight은 트럭들의 무게

            Queue<Integer> queue = new LinkedList<>();
            int limit =0;
            for (int i = 0; i <truck_weights.length ; i++) {
                while(true){
                    if(queue.isEmpty()){
                        queue.add(truck_weights[i]);
                        limit+=truck_weights[i];
                        answer++;
                        break;
                    }
                    else if(queue.size() == bridge_length){
                        limit -= queue.poll();
                    }
                    else{
                        if(limit + truck_weights[i] > weight){
                            queue.add(0);
                            answer++;
                        }
                        else{
                            queue.add(truck_weights[i]);
                            limit+= truck_weights[i];
                            answer++;
                            break;
                        }
                    }
                }
            }
            answer+= bridge_length;
            return answer;
        }
    }
}
