class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char strArray[] = s.toCharArray();
        int start = 0, end = s.length()-1 ;

        while(start<end){
            if(!vowels.contains(String.valueOf(strArray[start]))){
                start++ ;
            }
            else if (!vowels.contains(String.valueOf(strArray[end]))){
                end-- ;
            }
            else {
                 char ch = strArray[start];
                strArray[start] = strArray[end];
                strArray[end] = ch ;
                start ++;
                end--;
            }
        }
        return new String(strArray);
        
    }
}