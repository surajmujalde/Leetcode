class Solution {
    public String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        
        int i = 0;
        while (i < s.length()) {
            if (result.length() > 0 && result.charAt(result.length() - 1) == s.charAt(i)) {
                result.deleteCharAt(result.length() - 1); // Remove the last character from the result
                i++;
            } else {
                result.append(s.charAt(i)); // Append the current character to the result
                i++;
            }
        }
        
        return result.toString();
    }

}