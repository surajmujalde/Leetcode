class Solution {
    public String decodeMessage(String key, String message) {
        char start = 'a';

        char table[] = new char[200];
        Arrays.fill(table, '\0');

        for(char ch : key.toCharArray()){
            if(ch != ' ' && table[ch]== 0){
               table[ch] = start;
               start ++;
            }
            
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : message.toCharArray()){
            if(ch == ' '){
                ans.append(' ');
            }
            else{
                char decode = table[ch];
                ans.append(decode);
            }

        }
        return ans.toString();
    }
}