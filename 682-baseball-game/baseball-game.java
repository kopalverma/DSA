class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st = new Stack<>();
        for(int i =0 ; i<operations.length ; i++){
            if(operations[i].equals("+")){
                if(st.size()>=2){
                    String m = st.pop();
                    String n = st.peek();
                    int k = Integer.parseInt(m)+Integer.parseInt(n);
                    st.push(m);
                    st.push(String.valueOf(k));
                }

            }
            else if(operations[i].equals("D")){
                String o = st.peek();
                int p = 2*Integer.parseInt(o);
                st.push(String.valueOf(p));
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(operations[i]);
            }
        }
        int r=0;
        if(st.isEmpty()) return 0;
        while(!st.isEmpty()){
            int q=Integer.parseInt(st.pop());
            r = r+q;
        } 
        
        return r;  
    }
}