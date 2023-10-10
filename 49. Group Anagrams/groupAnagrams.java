class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs){
            char charStr[] = str.toCharArray();
            Arrays.sort(charStr);
            String sortStr = new String(charStr);

            if(!anagramMap.containsKey(sortStr)){
                anagramMap.put(sortStr, new ArrayList<>());
            }
            anagramMap.get(sortStr).add(str);

        }
        List<List<String>> result = new ArrayList<>(anagramMap.values());
        return result;
        
    }
}