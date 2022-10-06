package Programmers.level0;

import java.util.Scanner;

public class PrintTriangle {
  static public class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for (int i = n-1; i >=0 ; i--) {
        for (int j = i; j < n; j++) {
          System.out.print("*");
        }
        System.out.println();
      }

    }
  }
}
