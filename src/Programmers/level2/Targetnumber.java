package Programmers.level2;

public class Targetnumber {
    static public int solution(int[] numbers, int target) {
        int answer = 0;

        //n개의 음이 아닌 정수
        //더하거나 빼서 target를 맞추려고함 이때 방법의 수를 return

        //처음에 -1 or 1이 들어가야됨
        int length =1;
        answer = dfs(numbers,target,length,numbers[0]) + dfs(numbers,target,length,-numbers[0]);

        return answer;
    }

    static int dfs(int[] numbers, int target , int length, int start){

        if(numbers.length == length){
            return target == start ? 1 : 0;
        }

        int total =0;
        total+= dfs(numbers, target, length+1, start-numbers[length]);
        total+= dfs(numbers, target, length+1, start+numbers[length]);
        return total;
    }

}
