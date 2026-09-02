class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return f(0, dp, days, costs, n);
    }

    public int f(int i, int[] dp, int[] days, int[] costs, int n){
        if(i>=n)return 0;

        if(dp[i]!=-1)return dp[i];

        int one = costs[0] + f(helper(i, days, 1), dp, days, costs, n);
        int seven = costs[1] + f(helper(i, days, 7), dp, days, costs, n);
        int thirty = costs[2] + f(helper(i, days, 30), dp, days, costs, n);

        return dp[i] = Math.min(one, Math.min(seven, thirty));
    }

    public int helper(int j, int[] nums, int cost){
        for(int i=j; i<nums.length; i++){
            if(nums[i] >= nums[j] + cost){
                return i;
            }
        }
        return nums.length;
    }
}