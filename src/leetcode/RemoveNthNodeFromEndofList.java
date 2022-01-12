package leetcode;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            //링크드리스트의 head를 준다
            //끝에서 n번째 node를 제거하고 그 헤드를 리턴해라
            // 1-> 2->3->4->5->null n=2

            //전체 개수 세기
            ListNode current1 = head;

            //처음 head 유지
            ListNode current2 = head;

            int count =1;
            while(current1.next != null){
                count++;
                current1 = current1.next;
            }

            //총개수가 1개면
            if(count == 1){
                return null;
            }
            // 전체길이와 제거할 n이 같다면
            else if(n == count){
                return head.next;
            }
            else{
                for (int i = 0; i <count-1 -n ; i++) {
                    current2 = current2.next;
                }
                current2.next = current2.next.next;
                return head;
            }

        }
    }

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

}
