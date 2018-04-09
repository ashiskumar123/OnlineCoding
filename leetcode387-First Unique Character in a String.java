class Solution {
    public int firstUniqChar(String s) {
        int [] counter = new int[26];
        
        for(char c: s.toCharArray())
            counter[c-'a']++;
        
        int i=0;
        for(char c: s.toCharArray()){
            if(counter[c-'a']<2)
                return i;
            i++;
        }
        
        return -1;
    }
}
