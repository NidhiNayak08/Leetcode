class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int max = 0;

        for(int x : nums){
            max = Math.max(max, x);
        }

        int[] points = new int[max+1];

        for(int num : nums){
            points[num]+= num;
        }

        int[] dp = new int[max+1];
        Arrays.fill(dp, -1);

        return f(0, points, dp, max);
    }

    public int f(int i, int[] points, int[] dp, int n){
        if(i>n)return 0;

        if(dp[i]!=-1)return dp[i];

        int take = points[i] + f(i+2, points, dp, n);
        int nottake = f(i+1, points, dp, n);

        return dp[i] = Math.max(take, nottake);
    }
}