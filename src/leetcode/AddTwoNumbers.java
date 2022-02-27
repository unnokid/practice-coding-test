package leetcode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode A = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode B = new ListNode(5,new ListNode(6, new ListNode(4)));
        System.out.println(solution.addTwoNumbers(A,B));
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            //각 자리의 합 더하기

            //앞에 하나 추가로 만들기
            ListNode node = new ListNode(0);
            ListNode answer = node;

            int sum=0;
            while(l1 != null || l2!= null || sum >0){

                if(l1 !=null){
                    sum+=l1.val;
                    l1 = l1.next;
                }

                if(l2 !=null){
                    sum+=l2.val;
                    l2 = l2.next;
                }

                //자릿수 깎기
                node.next = new ListNode(sum%10);
                sum/=10;
                node = node.next;
            }
            return answer.next;

        }
    }

    static public class ListNode {
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
