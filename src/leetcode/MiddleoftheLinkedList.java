package leetcode;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {

    }

    static class Solution {
        public ListNode middleNode(ListNode head) {

            //하나의 링크드 리스트의 머리가 주어짐
            //중간 노드부터 출력해라

            //전체 크기가 홀수냐 짝수냐
            ListNode currentNode = head;
            int count =1;
            while(currentNode.next != null){
                count++;
                currentNode = currentNode.next;
            }

            int target = count/2;
            currentNode = head;
            while(target !=0){
                target--;
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
