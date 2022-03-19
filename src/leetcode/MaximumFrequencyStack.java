package leetcode;

import java.util.*;

public class MaximumFrequencyStack {
    public static void main(String[] args) {
        FreqStack freqStack = new FreqStack();
        freqStack.push(7); // The stack is [5]
        freqStack.push(5); // The stack is [5,7]
        freqStack.push(7); // The stack is [5,7,5]
        freqStack.push(5); // The stack is [5,7,5,7]
        freqStack.push(4); // The stack is [5,7,5,7,4]
        freqStack.push(5); // The stack is [5,7,5,7,4,5]
        freqStack.pop();   // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
        freqStack.pop();   // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The stack becomes [5,7,5,4].
        freqStack.pop();   // return 5, as 5 is the most frequent. The stack becomes [5,7,4].
        freqStack.pop();
        //System.out.println(freqStack); // 5,7

    }
    static class FreqStack {
        //기본 스택을 하나만들고 다른 도구가 필요해보임
        //얼마나 빈도가 많은지에 대한 체크 필요
        //각 숫자에 빈도수와 스택이 연관
        Map<Integer,Integer> freq;
        List<Stack<Integer>> stacks;
        public FreqStack() {
            //빈 frequency stack 으로 구성되어짐
            freq = new HashMap<>();
            stacks = new ArrayList<>();

        }

        public void push(int val) {
            //스택 맨위에 val값을 push함
            //빈도에 먼저 있는지 체크
            int count = freq.getOrDefault(val,0)+1;
            freq.put(val,count);

            if(stacks.size() < count){
                //스택 개수를 더늘려야함
                stacks.add(new Stack<>());
            }
            stacks.get(--count).push(val);
            System.out.println(stacks);
        }

        public int pop() {
            //제거하고 돌려준다 가장 빈번한 요소를
            //만약 횟수가 동일한 요소가 있다면 스택의 탑에 가까운 요소를 줌
            Stack<Integer> stack = stacks.get(stacks.size()-1);
            int val = stack.pop();

            if(stack.isEmpty()){
                stacks.remove(stacks.size()-1);
            }
            //1개 줄이기
            freq.put(val,freq.get(val)-1);
            return val;
        }
    }

    /**
     * Your FreqStack object will be instantiated and called as such:
     * FreqStack obj = new FreqStack();
     * obj.push(val);
     * int param_2 = obj.pop();
     */
}
