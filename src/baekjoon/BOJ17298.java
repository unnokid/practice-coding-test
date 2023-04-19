package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        //백준 17298 오큰수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String[] s = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < N; i++) {
            //전체를 돌면서 체크해야함
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                //스택이 비지 않았으면 비교를 시작해야함
                //만약 현재값이 전에 담겼던 값보다 크다면
                //그 전에 있던 인덱스에 현재값을 갱신
                arr[stack.pop()] = arr[i];
            }
            //현재위치의 비교대상을 추가함
            stack.push(i);
        }

        //아직까지도 stack에 남아있는 숫자가 있다면 그건 오른쪽에 큰수가 존재X
        while(!stack.isEmpty()){
            arr[stack.pop()] =-1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }

}
