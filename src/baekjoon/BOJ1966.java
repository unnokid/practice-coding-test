package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BOJ1966 {

  public static void main(String[] args) throws IOException {
    //백준 1966 프린터 큐

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());//연산 수

    for (int i = 0; i < T; i++) {
      String[] s = br.readLine().split(" ");
      int N = Integer.parseInt(s[0]); //리스트 개수
      int M = Integer.parseInt(s[1]); // 찾으려는 친구 인덱스
      Map<Integer,Integer> map = new HashMap<>();
      String[] temp = br.readLine().split(" ");
      int[] list = new int[N]; //원본
      int[] maxList = new int[N]; //정렬된 최댓값 찾기
      for (int j = 0; j <N ; j++) {
        list[j] = Integer.parseInt(temp[j]);
        maxList[j] = Integer.parseInt(temp[j]);
        map.put(Integer.parseInt(temp[j]), map.getOrDefault(Integer.parseInt(temp[j]),0)+1);
      }
      Arrays.sort(maxList);
      int total =1;//나간 순서
      for (int j = N-1; j >=0 ; j--) {
        //여기서 maxList[j] 최댓값
        int max = maxList[j];
        boolean check =false;
        if(map.get(max) >1){
          //최댓값이 여러개
          check = true;
        }
        int count = 0;
        while(count < list.length){
          if(list[0] == max){
            //최대 찾음
            break;
          }
          //아니면 다시 정렬
          swap(list);
          if(M ==0){
            M = N-1;
          }else{
            M--;
          }
          count++;
        }

        if(M == 0){
          System.out.println(total);
          break;
        }else{
          if(check){
            swap(list);
            if(M ==0){
              M = N-1;
            }else{
              M--;
            }
          }
          total++;
        }

      }

    }
  }
  static void swap(int[] p){
    int temp = p[0];
    int i;
    for (i = 0; i <p.length-1 ; i++) {
      p[i] = p[i+1];
    }
    p[i] = temp;
  }
}
