class Solution {
    public static String createMapping(String str){
        char start = 'a';
        char mapping[] = new char[200];
        Arrays.fill(mapping, '\0');

        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(mapping[ch]==0){
                mapping[ch] =start;
                start++;
            }
             result.append(mapping[ch]);
        }
        return result.toString();
       
        
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String mappedPattern = createMapping(pattern);
        ArrayList<String> list = new ArrayList();

        for(String str : words){
            String newMappd = createMapping(str);
            if(newMappd.equals(mappedPattern)){
                list.add(str);

            }
        }
        return list;

    }
}