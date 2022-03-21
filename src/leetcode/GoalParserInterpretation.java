package leetcode;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String command;
        command = "G()(al)";
        System.out.println(solution.interpret(command));
        command = "G()()()()(al)";
        System.out.println(solution.interpret(command));
        command = "(al)G(al)()()G";
        System.out.println(solution.interpret(command));
    }
    static class Solution {
        public String interpret(String command) {
            // G -> G
            // () -> o
            // (al) -> al
            //3가지 조건을 충족시킨 문자열 return
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <command.length() ; i++) {
                if(command.charAt(i) == '('){
                    if(command.charAt(i+1) == ')'){
                        sb.append("o");
                    }
                    else{
                        sb.append("al");
                    }
                }
                else if(command.charAt(i) == 'G'){
                    sb.append("G");
                }
            }
            return sb.toString();
        }
    }
}
