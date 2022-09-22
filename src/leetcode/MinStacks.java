package leetcode;

import java.util.Stack;

public class MinStacks {

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin();
    minStack.pop();
    minStack.top();
    minStack.getMin();
  }

  static class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
      stack = new Stack<>();
      minStack = new Stack<>();
    }

    public void push(int val) {
      stack.push(val);
      if (minStack.size() == 0 || val <= minStack.peek()) {
        minStack.push(val);
      }
    }

    public void pop() {
      int value = stack.pop();
      if (value == minStack.peek()) {
        minStack.pop();
      }
    }

    public int top() {
      return stack.peek();
    }

    public int getMin() {
      return minStack.peek();
    }
  }
}
