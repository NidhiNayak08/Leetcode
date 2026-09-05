class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return f(0, dp, s, n);

    }

    public int f(int i, int[] dp, String s, int n){

        if(i>=n)return 1;

        if(dp[i]!=-1)return dp[i];

        int oneDig = 0;
        
        if(s.charAt(i)!= '0'){
            oneDig = f(i+1, dp, s, n);
        }

        int twoDig = 0;

        if(i+1<n){
            int num = Integer.parseInt(s.substring(i, i+2));
            if(num>=10 && num<=26){
                twoDig = f(i+2, dp, s, n);
            }
        }

        return dp[i] = oneDig + twoDig;
    }
    
}