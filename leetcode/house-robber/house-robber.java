class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return f(0, nums, dp, n);
    }

    public int f(int i, int[] nums, int[] dp, int n){
        //bc - what we can ans directly
        if(i>=n)return 0;

        if(dp[i]!=-1)return dp[i];

        //at i, what choices do we have
        int pick = nums[i] + f(i+2, nums, dp, n);
        int notpick = f(i+1, nums, dp, n);

        return dp[i] = Math.max(pick, notpick);
    }
}

//