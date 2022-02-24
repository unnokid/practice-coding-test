package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(4, new ListNode(2,new ListNode(1, new ListNode(3,null))));
        System.out.println(solution.sortList(head));
    }

    static class Solution {
        public ListNode sortList(ListNode head) {
            //ListNode를 줄때 정렬해라
            //이때 시간복잡도 logn, 공간복잡도 1

            //1. 공간복잡도 생각안하고 만듬
            /*//비어있거나 다음이 비면 그대로
            if(head == null || head.next == null){
                return head;
            }

            //Collection을 이용할 list
            List<Integer> list = new ArrayList<>();

            while(head != null){
                list.add(head.val);
                head = head.next;
            }
            // 4, 3, 2, 1 순서로 만들어서 3만들때 next가 4다
            Collections.sort(list,Collections.reverseOrder());
            //System.out.println(list);
            //4먼저 만들기
            ListNode result = new ListNode(list.get(0));
            for (int i = 1; i <list.size() ; i++) {
                result = new ListNode(list.get(i),result);
            }
            return result;*/

            if(head == null || head.next == null) {
                return head;
            }
            ListNode mid = findMiddle(head);
            ListNode left = sortList(head);
            ListNode right = sortList(mid);
            return merge(left, right);
        }

        public static ListNode findMiddle(ListNode head){
            ListNode cur = null;
            ListNode before = head;
            ListNode after = head;
            while(after != null && after.next != null) {
                cur = before;
                before = before.next;
                after = after.next.next;
            }
            cur.next = null;
            return before;
        }
        public ListNode merge(ListNode left, ListNode right) {
            ListNode temp2 = new ListNode(0);
            ListNode temp = temp2;
            while(left != null && right != null) {
                int val1 = left.val;
                int val2 = right.val;
                if(val1 > val2) {
                    temp2.next = right;
                    right = right.next;
                } else {
                    temp2.next = left;
                    left = left.next;
                }
                temp2 = temp2.next;
            }
            temp2.next = left == null ? right : left;
            return temp.next;
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
