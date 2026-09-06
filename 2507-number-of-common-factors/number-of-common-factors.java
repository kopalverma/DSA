class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> at = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 1 ; i<=a ; i++){
            if(a%i == 0) at.add(i);
        }
        for(int i = 1 ; i<=b ; i++){
            if(b%i == 0) a1.add(i);
        }
        at.retainAll(a1);
        return at.size();
    }
}