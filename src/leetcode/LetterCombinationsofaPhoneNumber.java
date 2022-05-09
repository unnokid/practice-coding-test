package leetcode;

import java.util.*;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits;
        digits = "23";
        System.out.println(solution.letterCombinations(digits));
        digits = "";
        System.out.println(solution.letterCombinations(digits));
        digits = "2";
        System.out.println(solution.letterCombinations(digits));
    }

    static class Solution {
        List<String> list;
        Map<Integer, List<Character>> map;

        public List<String> letterCombinations(String digits) {
            list = new ArrayList<>();
            map = new HashMap<>();

            if(digits.length() ==0){
                return list;
            }

            map.put(2, new ArrayList<>(Arrays.asList('a', 'b', 'c')));
            map.put(3, new ArrayList<>(Arrays.asList('d', 'e', 'f')));
            map.put(4, new ArrayList<>(Arrays.asList('g', 'h', 'i')));
            map.put(5, new ArrayList<>(Arrays.asList('j', 'k', 'l')));
            map.put(6, new ArrayList<>(Arrays.asList('m', 'n', 'o')));
            map.put(7, new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
            map.put(8, new ArrayList<>(Arrays.asList('t', 'u', 'v')));
            map.put(9, new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));

            check(digits, 0, digits.length(), "");
            return list;
        }

        void check(String digits, int idx, int len, String temp) {
            System.out.println("현재 temp: " + temp);
            if (temp.length() == len) {
                list.add(temp);
                return;
            }


            int target = digits.charAt(idx) - 48;
            System.out.println(target);
            List<Character> alp = map.get(target);
            for (int j = 0; j < alp.size(); j++) {
                check(digits, idx + 1, len, temp + alp.get(j));
            }

        }
    }
}
