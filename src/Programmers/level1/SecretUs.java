package Programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class SecretUs {

    public static void main(String[] args) {

    }
    static class Solution {
        public String solution(String s, String skip, int index) {
            StringBuilder sb = new StringBuilder();

            List<Character> skipList = new ArrayList<>();

            for (int i = 0; i <skip.length() ; i++) {
                skipList.add(skip.charAt(i));
            }

            for (int i = 0; i <s.length() ; i++) {
                char target = s.charAt(i);
                int count = index;
                while(count >0){
                    target++;
                    if(target > 'z'){
                        target-=32;
                    }
                    if(skipList.contains(target)){
                        count++;
                    }
                    count--;
                }
                System.out.println("현재 타겟"+target);

                sb.append(target);
            }


            return sb.toString();
        }
    }
}
