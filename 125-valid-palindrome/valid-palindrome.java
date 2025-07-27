class Solution {
    public boolean isalphanum(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    public char tolowercase(char ch) {
        if (ch >= 'A' && ch <= 'Z') { // Corrected condition
            ch = (char) (ch + 32);
            return ch;
        } else {
            return ch;
        }
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            // Skip non-alphanumeric characters
            while (i < j && !isalphanum(s.charAt(i))) {
                i++;
            }
            while (i < j && !isalphanum(s.charAt(j))) {
                j--;
            }
            // Compare characters in lowercase
            if (tolowercase(s.charAt(i)) != tolowercase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "A man, a plan, a canal: Panama"; // Example input
        boolean result = obj.isPalindrome(s);
        System.out.println("Is the string a palindrome? " + result);
    }
}
