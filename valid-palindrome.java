class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filteredStr = new StringBuilder("");

        for(char ch: s.toCharArray()) {
           char chLower = Character.toLowerCase(ch);
           if(Character.isLetterOrDigit(chLower)) {
                filteredStr.append(chLower);
           }
           
        }
        
        for(int i = 0 ; i < filteredStr.length() - 1 ; i++ ) {
            if(filteredStr.charAt(i) != filteredStr.charAt((filteredStr.length()-1) - i )) {
                return false;
            }
            
        }
        return true;
    }
}
