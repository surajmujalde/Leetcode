class Solution {
    public int reverse(int x) {
        int rev = 0, rem = 0;
        boolean isNegative = false;

        if(x <= Integer.MIN_VALUE){
            return 0;
        }

        if(x<0){
            isNegative = true;
            x = -x;
        }

        while(x>0){
            if(rev>Integer.MAX_VALUE /10){
                return 0;
            }
            rem = x%10 ;
            rev = rev*10 + rem;
            x = x/10;
        }
        return isNegative? -rev: rev;
    }
}