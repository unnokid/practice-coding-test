package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    static class Solution {
        static Map<Node,Node> map = new HashMap<>();
        public Node cloneGraph(Node node) {
            //노드에 대한 정보를 부여함
            //그 노드를 깊은 복사로 만들어서 return

            //현재 Node와 val, 인접한 이웃을 담아야함
            //비어있으면 끝
            if(node == null){
                return null;
            }

            //map에 존재한다면 그 노드에 대한 val과 이웃 return
            if(map.containsKey(node)){
                return map.get(node);
            }

            //존재안하면
            //val값과 이웃을 담을 list 생성
            Node temp = new Node(node.val,new ArrayList<Node>());
            //이 노드를 키, 그리고 val값과 이웃을 닮은 리스트 값
            map.put(node,temp);

            
            //현재 node의 이웃을 가져와서 temp에 붙여넣기
            for(Node next : node.neighbors){
                //각 이웃값을 받아와서 temp에 붙이기
                //재귀로 돌려야 전체적인 map을 돌아
                //map에 존재하는지 체크
                temp.neighbors.add(cloneGraph(next));
            }
            return map.get(node);
            
        }
    }


    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
