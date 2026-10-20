class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 1;
        int s = intervals[0][0];
        int e = intervals[0][1];

        while (i < intervals.length) {
            if (intervals[i][0] <= e) {
                e = Math.max(e, intervals[i][1]);
            } else {
                list.add(new ArrayList<>(Arrays.asList(s, e)));
                s = intervals[i][0];
                e = intervals[i][1];
            }
            i++;
        }

        list.add(new ArrayList<>(Arrays.asList(s, e)));

        int[][] arr = list.stream()
            .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
            .toArray(int[][]::new);

        return arr;
    }
}