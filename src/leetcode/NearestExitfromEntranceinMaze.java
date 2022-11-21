package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitfromEntranceinMaze {

    public static void main(String[] args) {

    }

    static class Solution {

        public int nearestExit(char[][] maze, int[] entrance) {
            int rows = maze.length;
            int cols = maze[0].length;
            int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            int X = entrance[0];
            int Y = entrance[1];
            maze[X][Y] = '+';

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{X, Y, 0});

            while (!queue.isEmpty()) {
                int[] currState = queue.poll();
                int curX = currState[0];
                int curY = currState[1];
                int distance = currState[2];

                for (int[] arr : dirs) {
                    int nextX = curX + arr[0];
                    int nextY = curY + arr[1];
                    if (0 <= nextX && nextX < rows && 0 <= nextY && nextY < cols
                        && maze[nextX][nextY] == '.') {
                        if (nextX == 0 || nextX == rows - 1 || nextY == 0
                            || nextY == cols - 1) {
                            return distance + 1;
                        }
                        maze[nextX][nextY] = '+';
                        queue.offer(new int[]{nextX, nextY, distance + 1});
                    }
                }
            }

            return -1;
        }
    }
}
