class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length - 1;
        int c=0;
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int m = 0 ; m<people.length ; m++){
        //     arr.add(people[m]);
        // }
        Arrays.sort(people);
        while(i<=j && j>=0 && i<people.length){
            // if(i==j){
            //     c++;
            //     break;
            // }
            if(people[i]+people[j] <= limit){
                c++;
                i++;
                j--;
            }
            else{
                c++;
                j--;
            }
            
        }
        return c;
    }
}