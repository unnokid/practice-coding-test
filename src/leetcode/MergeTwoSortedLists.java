package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1;
        ListNode list2;
        list1 = new ListNode(1,new ListNode(2, new ListNode(4, null)));
        list2 = new ListNode(1,new ListNode(3, new ListNode(4, null)));
        System.out.println(solution.mergeTwoLists(list1,list2));
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            
            //list1, list2 합치기
            List<Integer> list = new ArrayList<>();
            while(list1 != null){
                list.add(list1.val);
                list1=list1.next;
            }

            while(list2 != null){
                list.add(list2.val);
                list2=list2.next;
            }

            if(list.size() <1){
                return null;
            }

            //역순 정렬 4 4 3 2 1 1
            Collections.sort(list,Collections.reverseOrder());
            ListNode temp = new ListNode(list.get(0),null);

            for (int i = 1; i <list.size() ; i++) {
                ListNode t = new ListNode(list.get(i),temp);
                temp = t;
            }

            return temp;
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
