class Solution {
    public double median(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }

    int f = 0;
    int l = nums.length - 1;
    double d = 0.0;

    if (nums.length % 2 == 0) {
        d = (nums[(f + l) / 2] + nums[((f + l) / 2) + 1]) / 2.0;
    } else {
        d = nums[(f + l) / 2];
    }

    return d;
}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0){
            return 0.0;
        }
        if(nums1.length == 0 && nums2.length != 0){
            return median(nums2);
        }
        if(nums2.length == 0 && nums1.length != 0){
            return median(nums1);
        }
        
        ArrayList<Integer> at= new ArrayList<>();
        for(int i=0 ; i<nums1.length ; i++){
            at.add(nums1[i]);
        }
        for(int i=0 ; i<nums2.length ; i++){
            at.add(nums2[i]);
        }
        Collections.sort(at);
        int f = 0;
        int l=at.size() - 1;
        if(at.size() % 2 == 0){
            return (at.get((f+l)/2) + at.get(((f+l)/2) + 1))/2.0;
        }
        else{
            return (at.get(((f+l)/2))) ;
        }
    }
}