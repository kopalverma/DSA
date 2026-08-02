class Solution {
    public boolean isPalindrome(int x) {
        int s=0;
        int t = x;
        while(x>0){
            int r = x%10;
            s = r+s*10;
            x = x/10;
        }
        if(s==t){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Solution obj = new Solution();
        obj.isPalindrome(n);
        if(true){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}