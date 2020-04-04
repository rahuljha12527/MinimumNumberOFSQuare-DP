
public class Solution {
	
    
    public static int minCount(int n,int dp[]){
        
        if(n==0){
            return 0;
        }
        
        int myAns=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int currentAns;
            if(dp[n-(i*i)]==-1){
               currentAns=minCount(n-(i*i));     
                dp[n-(i*i)]=currentAns;
            }else{
                currentAns=dp[n-(i*i)];
            }
            
            if(myAns>currentAns){
                myAns=currentAns;
            }
        }
        int myAnswer=1+myAns;
        return myAnswer;
    }
	public static int minCount(int n) {
		
        
        int dp[]=new int[n+1];
        
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        
        int ans=minCount(n,dp);
        
        return ans;
	}

	
}