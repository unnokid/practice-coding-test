package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        String p;/*
        s="cbaebabacd";
        p="abc";
        System.out.println(solution.findAnagrams(s,p));*/
        s="abab";
        p="ab";
        System.out.println(solution.findAnagrams(s,p));
    }
    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            //2개의 문자열을 준다
            //Anagram은 원래 문자를 한번씩 사용하여 재배열해 만들수있는 단어
            //모든 문자는 소문자


            List<Integer> answer = new ArrayList<>();

            if(s.length() < p.length()){
                //패턴이 원본보다 길면 끝
                return answer;
            }

            //원본 알파벳 배열과 비교알파벳 배열을 만듬
            int[] patten = new int[26];
            int[] target = new int[26];

            //patten배열 만들기
            for (int i = 0; i <p.length() ; i++) {
                patten[p.charAt(i)-97]++;
            }
            //처음 비교할 target배열 만들기
            for (int i = 0; i <p.length() ; i++) {
                target[s.charAt(i)-97]++;
            }

            int before = s.charAt(0)-97;

            for (int i = 0; i <s.length()-p.length() ; i++) {
                System.out.println("t"+Arrays.toString(target));
                System.out.println("p"+Arrays.toString(patten));
                if(Arrays.equals(patten, target)){
                    //배열이 같으면 answer추가
                    System.out.println(i +"answer 추가");
                    answer.add(i);
                }
                //앞에 자르고 그다음 인덱스를 before설정하고 뒤로 한칸늘리기
                target[before]--;

                before = s.charAt(i+1)-97;
                System.out.println("그다음빠짐"+s.charAt(i+1));
                target[s.charAt(p.length()+i)-97]++;
                System.out.println("추가"+s.charAt(p.length()+i));
            }
            //마지막 끝났을때 체크
            if(Arrays.equals(patten, target)){
                //배열이 같으면 answer추가
                System.out.println(s.length()-p.length() +"answer 추가");
                answer.add(s.length()-p.length());
            }

            return answer;
        }
    }
}
