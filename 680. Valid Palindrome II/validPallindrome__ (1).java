class Solution {

    public static boolean pallindrome(String s , int i , int j){
            while(i<j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }

    public boolean validPalindrome(String s) {
        int i = 0, j= s.length()-1 ;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                boolean ans1 = pallindrome(s, i+1 , j);
                boolean ans2 = pallindrome(s,i,j-1);

                return ans1||ans2 ;
            }
        }
        return true ;
        
    }
}