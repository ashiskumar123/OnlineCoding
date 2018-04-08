class Solution {
    public double largestSumOfAverages(int[] A, int K) {
        double [][] avg = new double[A.length][A.length];
        double [][] computedMax = new double[K][A.length];
        
        double ca = 0.0;
        
        for(int i=0;i<A.length;i++)
        {
            ca = 0.0;
            
            for(int j=i;j<A.length;j++)
            {
                ca += A[j];
                
                avg[i][j] = ca / (double)(j-i+1);
            }
            
            for(int j=0;j<K;j++)
                computedMax[j][i] = -1;
        }
        
        return getMaxPathSum(avg, K, 0, computedMax);
    }
    
    double getMaxPathSum(double[][] arr, int K, int p, double [][] computedMax)
    {
        if(K==1)
        {
            if(p<arr.length)
                return arr[p][arr.length-1];
            else
                return 0.0;
        }
        else if(K==0) {
            return 0.0;
        }
        
        double g = 0.0;
        
        for(int i=p;i<arr.length-K+1;i++){
            double v = arr[p][i];
            if(computedMax[K-1][i+1] == -1)
                computedMax[K-1][i+1] = getMaxPathSum(arr, K-1, i+1, computedMax);
            v+= computedMax[K-1][i+1];
            
            if(v > g)
                g = v;
        }
        
        return g;
    }
}