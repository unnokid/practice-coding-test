package leetcode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int val =6;
        ListNode no1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        System.out.println(solution.removeElements(no1,6));
    }

    static class Solution {
        public ListNode removeElements(ListNode head, int val) {

            //원본보다 앞에 한칸
            ListNode answer = new ListNode(0);
            answer.next = head;
            ListNode temp = answer;
            //첫값이 val이 일치할 경우


            //next하면서 val값일경우 다음으로 건너뛰기
            while(temp.next != null){
                if(temp.next.val == val){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }

            return answer.next;
        }
    }

    public static class ListNode {
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
