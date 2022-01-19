package leetcode;

import org.w3c.dom.Node;

public class PopulatingNextRightPointerrsinEachNode {
    public static void main(String[] args) {

    }

    static class Solution {
        public Node connect(Node root) {
            //완벽한 이진트리를 준다
            //각 레벨이 끝나면 #로 표시를 해달라 이런말인듯
            if(root == null || root.left ==null){
                return  root;
            }
            Node tempRoot = root;
            Node target = root.left;
            while(target != null){
                while(root!= null){
                    //이 노드 마지막끝
                    if(root.next == null){
                        //아래 노드 next를 이어주고 오른쪽은 null하기
                        root.left.next =root.right;
                        root.right.next =null;
                        break;
                    }
                    //마지막이 아니면 next가 존재하니까 넘어가서 right끝에 이어주기
                    root.left.next = root.right;
                    root.right.next = root.next.left;
                    root = root.next;
                }
                //다 돌았으면 그다음 레벨로 내려오기
                root = target;
                target = target.left;
            }
            return tempRoot;
        }
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;
}
