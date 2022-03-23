package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KeysandRooms {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> room;

    }
    static class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            //모든 방을 방문하는것이 목표
            // 0 번방은 잠겨있지 않아서 방에 들어가 열쇠를 얻을 수 있음
            //얻은 열쇠로 방을 들어가 새로운 열쇠를 획득해 모든 방을 다 돌 수 있는가?

            boolean[] visit = new boolean[rooms.size()];
            //0번 방 입장
            enter(rooms,0,visit);

            for (int i = 0; i <visit.length ; i++) {
                if(!visit[i]){
                    return false;
                }
            }
            return true;
        }
        static void enter(List<List<Integer>> rooms, int room, boolean[] visit){
            //방 입장함
            visit[room] = true;

            for(int nextKey : rooms.get(room)){
                if(!visit[nextKey]){
                    enter(rooms,nextKey,visit);
                }
            }
        }

    }
}
