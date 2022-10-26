package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11585 {

  public static void main(String[] args) throws IOException {
    //백준 11585 속타는 저녁

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringBuilder target = new StringBuilder();
    StringBuilder pattern = new StringBuilder();

    String[] s = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      target.append(s[i]);
    }

    String[]  p= br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      pattern.append(p[i]);
    }


    int a = target.length();
    int b = kmp(target.toString()+target.toString(), pattern.toString());
    int gcd = GCD(a,b);
    System.out.println((b/gcd)+"/"+(a/gcd));

  }
  static int[] makeArr(String pattern){
    int n = pattern.length();
    int[] arr = new int[n];
    int idx =0;

    for(int i=1; i<n; i++) {
      while(idx>0 && pattern.charAt(i)!= pattern.charAt(idx)) {
        idx = arr[idx-1];
      }
      if(pattern.charAt(i) == pattern.charAt(idx)) {
        arr[i] = ++idx;
      }
    }
    return arr;
  }
  static int kmp(String parent, String pattern){
    int n1 = parent.length();
    int n2 = pattern.length();
    int[] arr = makeArr(pattern);
    int idx =0 ;
    int count =0 ;
    for (int i = 0; i <n1-1 ; i++) {

      while(idx>0 && parent.charAt(i) != pattern.charAt(idx)){
        idx = arr[idx-1];
      }
      
      if(parent.charAt(i) == pattern.charAt(idx)){
        if(n2-1 == idx){
          count++;
          idx = arr[idx];
        }else{
          idx++;
        }
      }
    }
    return count;
  }
  static int GCD(int a, int b){
    //최대공약수
    if(a>b){
      int temp = a;
      a = b;
      b= temp;
    }

    while(a%b !=0){
      int temp = a% b;
      a = b;
      b = temp;
    }
    return b;
  }
}
