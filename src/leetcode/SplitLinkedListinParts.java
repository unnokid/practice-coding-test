package leetcode;

import java.util.Arrays;

public class SplitLinkedListinParts {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        ListNode root = new ListNode(1,new ListNode(2, new ListNode(3)));
        n=5;
        System.out.println(Arrays.toString(solution.splitListToParts(root, n)));
        root = new ListNode(1,new ListNode(2, new ListNode(3,new ListNode(4,
                new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8,
                        new ListNode(9,new ListNode(10))))))))));
        n=3;
        System.out.println(Arrays.toString(solution.splitListToParts(root, n)));
    }

    static class Solution {
        public ListNode[] splitListToParts(ListNode head, int k) {
            //리스트 노드를 줄 때
            //k만큼 파트를 나누고 싶다
            
            //전체 길이 11/3 3 11%3 == 2
            //3칸씩인데 앞에 2개는 한개씩 더 붙이기
            ListNode[] answer = new ListNode[k];
            ListNode temp = head;
            int len =0;
            while(temp != null){
                temp = temp.next;
                len++;
            }
            //각 들어갈 개수 count 와 딱 떨어지지않는 over 구하기
            int over = len%k;
            int count = len/k;
            temp = head;
            for (int i = 0; i < k; ++i) {
                ListNode cur = temp;

                //over가 들어갈 경우 한칸 늘리기
                int n = count;
                if(i < over){
                    n++;
                }

                //들어갈 개수 조절
                for (int j = 0; j < n - 1; ++j) {
                    if (temp != null){
                        temp = temp.next;
                    }
                }

                //null 이 아니라면 next 마감처리
                if (temp != null) {
                    ListNode prev = temp;
                    temp = temp.next;
                    prev.next = null;
                }
                answer[i] = cur;
            }

            return answer;
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
