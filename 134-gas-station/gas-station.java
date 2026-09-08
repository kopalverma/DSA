class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s = 0 ; int k = 0 ; 
        for(int i =0 ; i<gas.length ; i++){
            s += gas[i];
        }
        for(int i =0 ; i<cost.length ; i++){
            k += cost[i];
        }
        if(s<k) return -1;
        int curr = 0;
        int start = 0;
        for(int i = 0 ; i<gas.length ; i++){
            curr += gas[i] - cost[i];
            if(curr<0){
                start = i+1;
                curr = 0;
            }
        }
        return start;
    }
}