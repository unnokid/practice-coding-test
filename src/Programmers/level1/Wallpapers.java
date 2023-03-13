package Programmers.level1;

public class Wallpapers {

    public static void main(String[] args) {

    }

    static class Solution {
        public int[] solution(String[] wallpaper) {
            int[] answer = new int[]{50, 50, 0, 0};

            for (int i = 0; i < wallpaper.length; i++) {
                String cur = wallpaper[i];
                for (int j = 0; j < cur.length(); j++) {
                    if (cur.charAt(j) == '#') {
                        answer[0] = Math.min(answer[0], i);
                        answer[1] = Math.min(answer[1], j);
                        answer[2] = Math.max(answer[2], i);
                        answer[3] = Math.max(answer[3], j);
                    }
                }
            }

            return answer;
        }
    }
}
