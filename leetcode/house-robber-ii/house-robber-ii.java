class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int first = maxrob(0, dp, nums, n-2);

        int[] dp2 = new int[n+1];
        Arrays.fill(dp2, -1);
        int notfirst = maxrob(1, dp2, nums, n-1);
        return Math.max(first, notfirst);
    }

    public int maxrob(int i, int[] dp, int[] nums, int n){
        if(i>n)return 0;

        if(dp[i] != -1) return dp[i];


        int take = nums[i] + maxrob(i+2, dp, nums, n);
        int nottake = maxrob(i+1, dp, nums, n);

        return dp[i] = Math.max(take, nottake);

    }
}

//what doing -> optimize money
//what calc -> starting from a steo(i) what is max money we can get
//at i what choice i have -> take and skip 1 house, not take and go to another house
// smallest problem -> if i>n return 0
// recursive soln 