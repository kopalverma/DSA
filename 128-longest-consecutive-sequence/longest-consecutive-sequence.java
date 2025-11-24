class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        Collections.sort(list);
        int c=1;
        int max=1;
        for(int i=1 ; i<list.size() ; i++){
            int a=list.get(i-1);
            int b=list.get(i);
            if(a+1 == b){
                c++;
                if(c>=max){
                    max=c;
                }
            }
            else if(a == b){
                c=c+1;
                c=c-1;
            }
            else if(a+1 != b){
                if(c>=max){
                    max=c;
                }
                 c=1;

            }
            
            
        }
        return max;
    }
}