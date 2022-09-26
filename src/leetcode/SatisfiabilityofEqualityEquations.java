package leetcode;

public class SatisfiabilityofEqualityEquations {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] equations;
    equations = new String[]{"a==b","b!=a"};
    System.out.println(solution.equationsPossible(equations));
  }

  static class Solution {
    int[] map = new int[26];
    public boolean equationsPossible(String[] equations) {


      for (int i = 0; i <26 ; i++) {
        map[i] = i;
      }

      //조건 순회
      for (String equation : equations){
        if(equation.charAt(1) == '='){
          //최상위 루트 본체끼리 연결해주기
          map[find(equation.charAt(0) - 'a')] = find(equation.charAt(3)-'a');
        }
      }

      for (String equation : equations){
        //같지 않고 앞뒤 문자의 루트 맨위값이 동일한지 여부 확인
        if(equation.charAt(1) == '!' && find(equation.charAt(0)-'a') == find(equation.charAt(3)-'a')){
          return false;
        }
      }

      return true;
    }
    public int find(int x){
      if(x != map[x]){
        //루트본체가 아니다
        map[x] = find(map[x]);
      }
      return map[x];
    }

  }
}
