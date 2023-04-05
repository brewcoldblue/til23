package dijkstra_PQ;

import java.util.*;

public class Dijkstra_PQ {
    private static int INF = Integer.MAX_VALUE;

    public static int[] dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, INF);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> dist[i]));
        pq.offer(start);
        dist[start] = 0;

        while (!pq.isEmpty()) {
            int curr = pq.poll();
            if (visited[curr]) continue;
            visited[curr] = true;
            for (int neighbor = 0; neighbor < n; neighbor++) {
                int weight = graph[curr][neighbor];
                if (weight == 0) continue;
                int newDist = dist[curr] + weight;
                if (newDist < dist[neighbor]) {
                    dist[neighbor] = newDist;
                    pq.offer(neighbor);
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}};
        int start = 0;
        int[] dist = dijkstra(graph, start);
        System.out.println(Arrays.toString(dist)); // expected output: [0, 2, 5, 6, 11]
    }
}