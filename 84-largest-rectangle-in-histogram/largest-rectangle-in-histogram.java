class Solution {
    public int largestRectangleArea(int[] heights) {
        int a = 0;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] > heights[i]) {
                int top = s.pop();

                int w;
                if (s.isEmpty())
                    w = i;
                else
                    w = i - s.peek() - 1;

                a = Math.max(a, heights[top] * w);
            }

            s.push(i);
        }

        while (!s.isEmpty()) {
            int top = s.pop();

            int w;
            if (s.isEmpty())
                w = heights.length;
            else
                w = heights.length - s.peek() - 1;

            a = Math.max(a, heights[top] * w);
        }

        return a;
    }
}