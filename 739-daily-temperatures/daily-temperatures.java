class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] a = new int[temperatures.length];
        // int j=1;
        for(int i=0 ; i<temperatures.length ; i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                // st.pop();
                Integer s = st.pop();
                a[s] = i - s;
                // j++;
            }
            // a[i] = i;
            st.push(i);
        }
        return a;
    }
}