class Solution {
    public boolean isAnagram(String s, String t) {
        char st1[] = s.toCharArray();
        char st2[] = t.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        if(st1.length != st2.length){
            return false;
        }
        
            int i=0;
            while(i<st1.length){
                if(st1[i] != st2[i]){
                    return false;
                }
                i++;
            }
            
        
        return true;
        
    }
}