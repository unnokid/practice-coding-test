package Programmers.level2;

public class Skill {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String skill;
        String[] skill_trees;
        skill = "CBD";
        skill_trees = new String[] {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution.solution(skill,skill_trees));
    }
    static class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;

            //스킬을 배움
            //skill -> 선행스킬이라는게 존재함(앞에꺼 먼저 배워야 다음 스킬배울 수 있음)
            //스킬배우는 순서 배열을 줄때 가능한 스킬트리인지 가능한 개수를 return
            String[] result = new String[skill_trees.length];
            //각 스킬트리 순서
            for (int i = 0; i < skill_trees.length; i++) {
                String temp="";
                for (int j = 0; j <skill_trees[i].length() ; j++) {
                    //skill안에 들어가있는지 확인하기 있는 경우 temp에 때서 순서대로 result에 넣기
                    if (skill.contains(Character.toString(skill_trees[i].charAt(j)))){
                        temp+=skill_trees[i].charAt(j);
                    }
                }
                result[i] = temp;
            }
            //만들어낸 result와 skill 값이 동일하면 선행순서 만족
            for (int i = 0; i <result.length ; i++) {
                if(skill.substring(0,result[i].length()).equals(result[i])){
                    answer++;
                }
            }
            return answer;
        }
    }
}
