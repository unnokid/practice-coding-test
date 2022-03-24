package leetcode;

import java.util.Arrays;

public class BoatstoSavePeople {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] people;
        int limit;
        people = new int[]{1,2};
        limit = 3;
        System.out.println(solution.numRescueBoats(people,limit));
        people = new int[]{3,2,2,1};
        limit = 3;
        System.out.println(solution.numRescueBoats(people,limit));
        people = new int[]{3,5,3,4};
        limit = 5;
        System.out.println(solution.numRescueBoats(people,limit));
        people = new int[]{5,1,4,2};
        limit = 6;
        System.out.println(solution.numRescueBoats(people,limit));

    }
    static class Solution {
        public int numRescueBoats(int[] people, int limit) {
            //사람 배열과 인원수를 줌
            //보트를 몇번 운행해야하는지 return

            int min = 0;
            int max =people.length-1;
            int count =0;
            Arrays.sort(people);

            while(min <=max){
                count++;
                if(people[min]+people[max] <=limit){
                    min++;
                }
                max--;
            }
            return count;
        }
    }
}
