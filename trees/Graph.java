
import java.util.*;

public class Graph {

    static void insertEdge(int[][] arr, int u, int v) {
        arr[u][v] = 1;
        arr[v][u] = 1;
    }

    static void bfs(int[][] arr, int start) {

        boolean[] visited = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int edges = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            insertEdge(arr, u, v);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Sample Input:
4
5
0 1
1 2
2 3
3 0
0 2
 */
