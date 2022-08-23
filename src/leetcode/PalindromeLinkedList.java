package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {

  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode root4 = new ListNode(1);
    ListNode root3 = new ListNode(2,root4);
    ListNode root5 = new ListNode(3,root3);
    ListNode root2 = new ListNode(2,root5);
    ListNode root1 = new ListNode(1,root2);
    System.out.println(solution.isPalindrome(root1));
  }
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  static class Solution {
    public boolean isPalindrome(ListNode head) {
      //LinkedList 부여
      //이게 대칭구조인가
      boolean result = true;
      List<Integer> list = new ArrayList<>();
      //List 추출
      while(head != null){
        list.add(head.val);
        head = head.next;
      }

      for (int i = 0; i <list.size()/2 ; i++) {
        if(list.get(i) != list.get(list.size()-i -1)){
          result = false;
        }
      }

      return result;
    }
  }
}
