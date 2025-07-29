import java.util.*;

class Solution {

    
    public int romanToInt(String s) {
        
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            
            if (currentValue < prevValue) {
                result -= currentValue;
            } 
           
            else {
                result += currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        
        System.out.println("Enter a Roman numeral:");
        String va = sc.nextLine();
        
        int result = obj.romanToInt(va);
        System.out.println("Number = " + result);
    }
}
