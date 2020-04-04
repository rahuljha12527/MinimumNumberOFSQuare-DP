
public class Solution {
	
	public static int minCount(int n) {
		
         if(n==0){
             return 0;
         }
        
        int dp[]=new int[n+1];
        
         dp[0]=0;
        
        for(int i=1;i<=n;i++){
            int max=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                
              int ans=dp[i-(j*j)];
                
               if(ans<max){
                   max=ans;
               } 
                
            }
            
            dp[i]=1+max;
            
        }
         return dp[n];
	}

	
}