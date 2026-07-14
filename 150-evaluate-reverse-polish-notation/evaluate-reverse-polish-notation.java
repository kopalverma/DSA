class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(int i=0 ; i<tokens.length ; i++){
            st.push(tokens[i]);
            if(st.peek().equals("+")){
                String a = st.pop();
                int b = Integer.parseInt(st.pop());
                int c = Integer.parseInt(st.pop());
                int d = add(b , c);
                st.push(String.valueOf(d));
                
            }
            if(st.peek().equals("-")){
                String a = st.pop();
                int b = Integer.parseInt(st.pop());
                int c = Integer.parseInt(st.pop());
                int d = sub(c , b);
                st.push(String.valueOf(d));
                
            }
            if(st.peek().equals("*")){
                String a = st.pop();
                int b = Integer.parseInt(st.pop());
                int c = Integer.parseInt(st.pop());
                int d = mul(b , c);
                st.push(String.valueOf(d));
                
            }
            if(st.peek().equals("/")){
                String a = st.pop();
                int b = Integer.parseInt(st.pop());
                int c = Integer.parseInt(st.pop());
                int d = div(c , b);
                st.push(String.valueOf(d));
                
            }

        }
        int e = Integer.parseInt(st.peek());
        return e;
    }
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a , int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }
}