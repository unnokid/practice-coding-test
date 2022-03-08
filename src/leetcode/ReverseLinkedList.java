package leetcode;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            //Linked list을 줄때 반대로 뒤집기

            if(head == null || head.next == null){
                return head;
            }

            //자리바꿔주기

            ListNode root = null;

            //root-temp-head 관계
            //head을 밀면서 temp다음을 root로 바꾸기
            while(head != null){
                ListNode temp = head;
                head = head.next;
                temp.next = root;
                root = temp;
            }
            return root;

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
