class Solution {
    public int thirdMax(int[] nums) {
        Integer a=null, b=null, c=null, f=0;
        
        for(int i=0;i<nums.length;i++){
            if((a!=null && nums[i] == a) || (b!=null && nums[i] == b) || (c!=null && nums[i] == c))
                continue;
            if(a==null || nums[i] >= a) {
                c = b;
                b = a;
                a = nums[i];
            }
            else if(b==null || nums[i] >= b) {
                c=b;
                b=nums[i];
            }
            else if(c==null || nums[i] >= c) {
                c=nums[i];
            }
        }
        return c==null?a:c;
    }
}
