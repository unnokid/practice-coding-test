package leetcode;

import java.util.Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] f;
        int n;

        f = new int[]{1,0,0,0,1};
        n=1;
        System.out.println(solution.canPlaceFlowers(f,n));
        f = new int[]{1,0,0,0,1};
        n=2;
        System.out.println(solution.canPlaceFlowers(f,n));
        f = new int[]{1,0,0,0,0,1};
        n=2;
        System.out.println(solution.canPlaceFlowers(f,n));
    }
    static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            //꽃밭의 지도를 주고
            //n이라는 꽃개수를 주었을 때 꽃을 심을 수 있는지 여부판단

            int count =0;
            //전체를 돌면서 0인 부분을 찾기
            for (int i = 0; i <flowerbed.length ; i++) {
                //0이면 양옆을 확인해서 심을수 있는지 확인하기
                if(flowerbed[i] == 0){
                    if(i-1>=0){
                        if(flowerbed[i-1] ==1){
                            continue;
                        }
                    }

                    if(i+1<flowerbed.length){
                        if(flowerbed[i+1] ==1){
                            continue;
                        }
                    }
                    //심을수 있는게 확인되면 count++
                    //그자리를 1로 채운다
                    count++;
                    flowerbed[i] =1;
                    i+=1;
                }
            }
            return n<=count;
        }
    }
}
