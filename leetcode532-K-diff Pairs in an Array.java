ass Solution {
    public int findPairs(int[] nums, int k) {
        
        if(k < 0)
            return 0;
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        
        int p=0;
        
        if(k != 0){
            for (Integer key : hm.keySet())
                p+= hm.containsKey(key+k)? 1:0;
        } else {
            for (Integer key : hm.keySet())
                p+= hm.getOrDefault(key, 0)>1?1:0;
        }
        return p;
    }
}
