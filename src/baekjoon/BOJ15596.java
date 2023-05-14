package baekjoon;

public class BOJ15596 {
    //백준 15596 정수 N개의 합
    public long sum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
