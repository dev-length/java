package algorithm;

public class dungeons {
    private static int maxDungeons = 0;

    public static int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        exploreDungeons(k, dungeons, visited, 0);
        return maxDungeons;
    }

    private static void exploreDungeons(int k, int[][] dungeons, boolean[] visited, int count) {
        maxDungeons = Math.max(maxDungeons, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                exploreDungeons(k - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80, 20}, {50, 10}, {60, 30}, {30, 10}}));
    }
}
