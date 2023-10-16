class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        String newStr = "";
        while(true){
            char currentCh = 0;
            for(String str : strs){
                if(i>=str.length()){
                    currentCh = 0;
                    break;
                }
                if(currentCh ==0) {
                    currentCh = str.charAt(i);
                }
                else if(str.charAt(i) != currentCh){
                    currentCh = 0;
                    break;
                }
                
            }
            if(currentCh == 0){
                    break;
                }
                newStr += currentCh ;
                i++;
        }
        return newStr ;

        
    }
}