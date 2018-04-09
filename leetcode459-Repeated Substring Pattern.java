class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() < 2)
            return false;
        
        int p=1, q=1, l=s.length();
        
        char ch [] = s.toCharArray();
        
        boolean mismatch = false;
        while(p <= l/2){
            if(l%p==0){
                mismatch = false;
                int m = (l/p - 1);
                for(int i=1;i<=m; i++)
                {
                    for(int j=0;j<p;j++)
                        if(ch[j]!=ch[i*p + j])
                        {
                            p++;
                            mismatch = true;
                            break;
                        }
                    if(mismatch)
                        break;
                }
            }
            else
                p++;
            if(!mismatch)
                break;
        }
        
        return !mismatch;
    }
}
