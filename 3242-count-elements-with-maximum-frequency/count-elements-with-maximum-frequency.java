class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] a = new int[101];
        for(int i = 0 ; i<nums.length ; i++){
            a[nums[i]]++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        int m = 0;
        for(int j = 0 ; j<a.length ; j++){
            al.add(Math.max(m , a[j]));
        }
        int max = Collections.max(al);
        int sum = 0;
        for(Integer i : al){
            if(max==i){

                sum = sum + i;
            }
        }
        // sum = m+sum;
        return sum;
    }
}