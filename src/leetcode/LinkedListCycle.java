package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode root = new ListNode(3);
    }

    static public class Solution {
        public boolean hasCycle(ListNode head) {
            //Linkedlist를 줄때 이게 cycle을 형성하는지 판단
            //맨마지막 노드가 전에 지나왔던 노드를 가리키는 경우

            //내가 가는길중에 지나온 길이 있는가?
            //지나온길을 저장해서 값이 있는가

            Map<ListNode,Integer> map = new HashMap<>();
            //없거나 1개있는 경우는 사이클없음
            if(head == null || head.next == null){
                return false;
            }

            while(true){
                if(map.containsKey(head)){
                    return true;
                }else{
                    map.put(head,1);
                }
                //다음칸
                head = head.next;

                if(head == null){
                    break;
                }
            }
            return false;


        }
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
