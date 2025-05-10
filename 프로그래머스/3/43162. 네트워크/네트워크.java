class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, visited, i);
                count++;
            }
        }

        return count;
    }

    private void dfs(int[][] computers, boolean[] visited, int start) {
        visited[start] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !visited[i]) {
                dfs(computers, visited, i);
            }
        }
    }
}