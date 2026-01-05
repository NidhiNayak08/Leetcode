# 📘 Problem Revision Tracker


| ID  | Title        | Difficulty | Language | Last Revised | Notes                      | Link |
|-----|-------------|-----------|----------|-------------|---------------------------|------------------------------------------------------|
| 62  | Unique Paths | Medium    | Java     | 29/12/2025  | Used DP on grids approach|[View](https://leetcode.com/problems/unique-paths/description/) |
|  64 |  Minimum Path Sum |   Medium  |   Java | 29/12/2025 | Tip : Out of bound case, base/end case, and think about what u will store in dp[n-1][m-1]  | [View](https://leetcode.com/problems/minimum-path-sum/description/)|
| 931  |  Minimum Falling Path Sum | Medium    | Java     | 1/1/2026  | Try each element of 1st row as start of recursion and takes minimum of all the resulting ans, check column out of bound case for matrix. Base case is row==n-1|[View](https://leetcode.com/problems/minimum-falling-path-sum/description/) |
| GFG  | Subset Sum Problem | Medium    | Java     | 2/1/2026  | take not-take approach|[View](https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1) |
| 416  | Partition Equal Subset Sum | Medium    | Java     | 2/1/2026  | Almost same as subset sum but here think about total sum and how to find out target sum from it. |[View](https://leetcode.com/problems/partition-equal-subset-sum/description/) |
| 322  | Coin Change | Medium    | Java     | 5/1/2025  | Tip : As you have to take minimum, if ur case is invalid, u need to return max value. Else comparision will not work if u take 0 or -1. Tip 2: Think about what happens when u add 1 + Integer.MAX_VALUE. It gives Integer overflow. use (int) 1e9 instead. |[View](https://leetcode.com/problems/coin-change/description/) |
