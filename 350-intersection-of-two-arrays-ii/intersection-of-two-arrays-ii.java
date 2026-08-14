class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        ArrayList<Integer> at = new ArrayList<>();
        for(int i=0 ; i<nums1.length ; i++){
            freq[nums1[i]]++;
        }
        for(int i=0 ; i<nums2.length ; i++){
            if(freq[nums2[i]] > 0){
                at.add(nums2[i]);
                freq[nums2[i]]--;
            }
        }
        int[] a = new int[at.size()];
        for(int i = 0 ; i<at.size() ; i++){
            a[i] = at.get(i);
        }
        return a;
    }
}