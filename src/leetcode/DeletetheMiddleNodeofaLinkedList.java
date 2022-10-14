package leetcode;

public class DeletetheMiddleNodeofaLinkedList {

  public static void main(String[] args) {

  }

  static class Solution {

    public ListNode deleteMiddle(ListNode head) {

      if(head.next == null){
        return null;
      }

      ListNode temp = head;
      int count = 0;
      while(temp != null){
        count++;
        temp = temp.next;
      }
      temp =head;
      count/=2;

      for (int i = 0; i <count -1 ; i++) {
        temp =temp.next;
      }
      temp.next = temp.next.next;

      return head;
    }

    public class ListNode {

      int val;
      ListNode next;

      ListNode() {
      }

      ListNode(int val) {
        this.val = val;
      }

      ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
      }
    }

  }
}
