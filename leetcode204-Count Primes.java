class Solution {
    public int countPrimes(int n) {
        if(n < 6) {
            int [] lookup = {0,0,0,1,2,2};
            return lookup[n];
        }
        
        int c = 2;
        
        for(int i=6;i<=n;i+=6) {
            c += checkPrime(i-1) + (i+1<n ? checkPrime(i+1) : 0);
        }
        
        return c;
    }
    
    public static int checkPrime(int n){
        if(n%2==0 || n%3==0)
            return 0;
        
        //Get multiple of 6 closest to root n
        int maxIter = 6*((int)Math.round(Math.sqrt(n)/6.0));
        
        for(int i=6;i<=maxIter;i+=6) {
            if(n%(i-1)==0 || n%(i+1)==0)
                return 0;
        }
        
        return 1;
    }
}
