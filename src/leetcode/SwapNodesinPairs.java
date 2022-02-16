package leetcode;

public class SwapNodesinPairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode no = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4))));
        System.out.println(solution.swapPairs(no));
    }

    static class Solution {
        public ListNode swapPairs(ListNode head) {
            //링크리스트를 줌
            // 쌍을 이루어서 교환

            if(head == null){
                return null;
            }

            if(head.next == null){
                return head;
            }

            //자리 바꾸기 이론
            ListNode temp = head;
            head = head.next;
            temp.next = head.next;
            head.next = temp;
            //이러면 B -> A -> C 가됨
            // head -> temp -> temp.next 상황

            ListNode remain = temp;//B 자리
            temp = temp.next;
            //temp는 C가 됨
            while (temp != null && temp.next != null){
                ListNode swap = temp;
                ListNode next = temp.next;
                //swap C next는 D
                remain.next = next; // B->D
                swap.next = next.next; // C -> E
                next.next = swap;//D->C
                
                //다음 E F로 움직이게 해야함
                remain = swap; // 4번째 자리
                temp = swap.next;// temp을 5번째 자리에 고정
            }

            return head;

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
