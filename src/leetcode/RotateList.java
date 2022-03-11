package leetcode;

public class RotateList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        ListNode root = new ListNode(1 , new ListNode(2, new ListNode( 3, new ListNode(4, new ListNode(5)))));
        n=2;
        System.out.println(solution.rotateRight(root,n));
    }

    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            //리스트노드가 주어질 때
            //n칸을 밀어서 앞에 붙임

            if(head == null){
                return null;
            }

            ListNode temp = head;
            int len =0;
            //전체 길이 구하기
            while(temp != null){
                temp= temp.next;
                len++;
            }

            //회전수를 나머지연산
            k= k%len;

            temp = head;

            //회전 수
            while(k >0){
                k--;
                //마지막 노드 가기
                while(temp.next != null){
                    temp = temp.next;
                }
                //마지막노드를 head앞에 붙이기
                temp.next = head;
                //마지막노드 앞에서 next는 null
                for (int i = 0; i < len -2; i++) {
                    head =head.next;
                }
                head.next = null;
                head = temp;
            }

            return head;

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
