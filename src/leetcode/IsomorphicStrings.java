package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        String t;
        s="egg";
        t="add";
        System.out.println(solution.isIsomorphic(s,t));
        s="foo";
        t="bar";
        System.out.println(solution.isIsomorphic(s,t));
    }
    static class Solution {
        public boolean isIsomorphic(String s, String t) {

            //앞에서 b -> c로 바뀌엇다면 키와 벨류로 생각가능
            //모든수가 다 다르면 상관없음
            Map<Character,Character> map = new HashMap<>();

            for (int i = 0; i <s.length() ; i++) {
                char s1 = s.charAt(i);
                char t1 = t.charAt(i);
                if(map.containsKey(s1)){
                    if(map.get(s1) != t1){
                        return false;
                    }
                }else if(map.containsValue(t1)){
                    return false;
                }
                map.put(s1,t1);
            }

            return true;
        }
    }
}
