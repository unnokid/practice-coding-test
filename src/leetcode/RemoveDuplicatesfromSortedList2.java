package leetcode;

public class RemoveDuplicatesfromSortedList2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode root = new ListNode(1,new ListNode(1,new ListNode(1, new ListNode(2, new ListNode(3)))));
        System.out.println(solution.deleteDuplicates(root));
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            //정렬된 링크드리스트 줌
            //중복된 요소를 제거한 링크드 리스트 return

            if (head == null || head.next == null) {
                return head;
            }

            ListNode root = new ListNode(-1,head);
            ListNode temp = root;
            while (temp.next != null && temp.next.next != null) {
                if (temp.next.val == temp.next.next.val) {
                    int val = temp.next.val;
                    while (temp.next != null && temp.next.val == val) {
                        //그냥 temp=temp.next하면 자리만 옮겨짐
                        temp.next = temp.next.next;
                    }
                }
                else {//중복안되면 다음
                    temp = temp.next;
                }
            }
            return root.next;
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
