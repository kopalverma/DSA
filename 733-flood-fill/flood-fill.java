class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial = image[sr][sc];
        int r = sr;
        int c = sc;
        boolean[][] visited = new boolean[image.length][image[0].length];

        return floodFill(image, sr, sc, color, initial, visited, r, c);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color, int initial, boolean[][] visited, int r, int c) {

        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return image;

        int m = image.length;
        int n = image[0].length;

        if(visited[sr][sc] || image[sr][sc] != initial)
            return image;

        image[sr][sc] = color;
        visited[sr][sc] = true;

        floodFill(image, sr + 1, sc, color, initial, visited, r, c);
        floodFill(image, sr, sc + 1, color, initial, visited, r, c);
        floodFill(image, sr - 1, sc, color, initial, visited, r, c);
        floodFill(image, sr, sc - 1, color, initial, visited, r, c);

        return image;
    }
}