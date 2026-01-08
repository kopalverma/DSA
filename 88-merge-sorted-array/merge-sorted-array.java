class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<nums1.length ;i++){
            if(i<m){
                list.add(nums1[i]);
            }
            else{
                list.add(nums2[i-m]);
            }
        }
        // for(int num : nums2){
        //     // if(num!=0){
        //     list.add(num);
        //     // }
        // }
        Collections.sort(list);
        // int[] arr = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++){
            nums1[i] = list.get(i);
        }
        // return arr;
         for(int i=0 ; i<list.size() ; i++){
            // arr[i] = list.get(i);
            System.out.print(nums1[i] + ",");
        }

        
    }
}