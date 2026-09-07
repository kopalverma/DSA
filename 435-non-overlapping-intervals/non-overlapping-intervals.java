class Solution {
    // public boolean comp(int[] arr)
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0]  ,b[0]));
        int c =1;
        int last = intervals[0][1];
        for(int i = 1 ; i<intervals.length ; i++){
            if(intervals[i][0] >= last){
                last = intervals[i][1];
                c++;
            }
            else {
                last =  Math.min(last , intervals[i][1]);
            }
        }
        return intervals.length - c;
    }
}