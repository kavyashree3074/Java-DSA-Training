package assignment4.module11;
public class SimpleMaze {
    static int N = 4;
    static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {
        // destination reached
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        // check valid move
        if (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1) {
            sol[x][y] = 1;
            // move right
            if (solveMaze(maze, x, y + 1, sol))
                return true;
            // move down
            if (solveMaze(maze, x + 1, y, sol))
                return true;
            // backtrack
            sol[x][y] = 0;
        }
        return false;
    }

    static void printSolution(int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(sol[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        int[][] sol = new int[N][N];
        if (solveMaze(maze, 0, 0, sol))
            printSolution(sol);
        else
            System.out.println("No path found");
    }
}