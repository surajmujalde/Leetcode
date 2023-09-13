class Solution {
    public boolean isPalindrome(int x) {
        int rem=0 ,rev=0;
        int original = x;
        if(x==0){
            return true;
        }
        while(x>0){
            rem = x%10;
            rev = rev*10+rem;
            x=x/10;
        }
        if(rev>0 && rev== original){
            return true;
        }
        else
        return false;
    }
}