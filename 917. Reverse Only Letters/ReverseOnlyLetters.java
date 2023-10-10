class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0, end = s.length()-1;
        char strArray[] = s.toCharArray();

        while(start<end){
            if(! Character.isLetter(strArray[start])){
                start++;

            }
            else if(! Character.isLetter(strArray[end])){
                end--;
            }
            else{
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