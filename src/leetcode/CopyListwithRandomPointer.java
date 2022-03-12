package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    static class Solution {
        public Node copyRandomList(Node head) {
            //목록 그대로 깊은 복사를 원하는것 같음

            Map<Node,Node> map = new HashMap<>();

            Node temp = head;
            while(temp !=null){
                map.put(temp, new Node(temp.val));
                temp= temp.next;
            }

            //처음으로 돌아오기
            temp = head;

            while(temp != null){
                //새로 만든 노드 next는 다음
                map.get(temp).next = map.get(temp.next);
                map.get(temp).random = map.get(temp.random);
                temp = temp.next;
            }

            return map.get(head);
        }
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
