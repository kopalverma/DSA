class Solution {
    public int[][] merge(int[][] intervals) 
    {
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       int[][] arr = new int[intervals.length][2]; 
       int start = intervals[0][0];
       int end = intervals[0][1];
       int k = 0;

       for(int i=0;i<intervals.length-1;i++)
       {
        if(intervals[i+1][0] <= end)
        {
            if(intervals[i+1][1] > end)          
            {
                end = intervals[i+1][1];
            }
        }
        else
        {
            arr[k][0] = start;
            arr[k][1] = end;
            k++;
            start = intervals[i+1][0];
            end = intervals[i+1][1];
        }
       }

       arr[k][0] = start;                        
       arr[k][1] = end;
       k++;

       int[][] arr2 = new int[k][2];
       for(int i=0;i<k;i++)
       {
        arr2[i][0] = arr[i][0];
        arr2[i][1] = arr[i][1];
       }
       return arr2;
    }
}