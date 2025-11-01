import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        List<List<Edge>> graph = new ArrayList<>();
        
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] r : road) {
            int a = r[0], b = r[1], c = r[2];
            // 양방향 도로이므로 양쪽에 모두 추가
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        // 현재까지의 누적 시간이 작은 순서
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.time));
        pq.offer(new Node(1, 0));
        
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int now = cur.idx;
            int time = cur.time;

            if (time > dist[now]) continue;

            // 인접 도로들 확인
            for (Edge e : graph.get(now)) {
                int next = e.to;
                int nextTime = time + e.w;

                // 더 짧은 경로를 찾으면 갱신
                if (nextTime < dist[next]) {
                    dist[next] = nextTime;
                    pq.offer(new Node(next, nextTime));
                }
            }
        }
        
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) answer++;
        }
        
        return answer;
    }
    
    static class Edge {
        public int to, w;
        
        Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }

    static class Node {
        public int idx, time;
        
        Node(int idx, int time) {
            this.idx = idx;
            this.time = time;
        }
    }
}