package leetcode;

import java.util.Stack;

public class OnlineStockSpan {

  public static void main(String[] args) {

  }
  static class StockSpanner {

    Stack<int[]> stack = new Stack<>();
    public StockSpanner() {

    }

    public int next(int price) {
      int result = 1;
      while(!stack.isEmpty() && stack.peek()[0] <= price){
        result+=stack.pop()[1];
      }
      stack.push(new int[]{price,result});
      return result;
    }
  }
}
