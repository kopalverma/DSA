class Solution {
    public String largestNumber(int[] nums) {
        int k=0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] == 0) k++;
        }
        String[] a = new String[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            a[i] = ""+nums[i];
        }
        Comparator<String> cmp = (c,b) -> (b+c).compareTo(c+b);
        Arrays.sort(a , cmp);
        String s = "";
        for(int i = 0 ; i<a.length ; i++){
            s = s +a[i];
        }
        if(k==nums.length) return "0";
        return s; 
    }
}