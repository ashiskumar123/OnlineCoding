class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] ac = new int[123];
        int l = p.length();
        List<Integer> pos = new ArrayList<Integer>();
        for(char c : p.toCharArray())
            ac[c]++;
        
        for(int i=0;i<s.length()-l+1;i++)
        {
            int cl = l;
            int [] acc = Arrays.copyOf(ac, ac.length);
            
            for(int j=0;j<p.length();j++){
                if(acc[s.charAt(i+j)] > 0)
                {
                    acc[s.charAt(i+j)]--;
                    cl--;
                }
                else
                    break;
            }
            if(cl==0){
                pos.add(i);
            }
        }
        
        return pos;
    }
}
