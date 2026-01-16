# 📘 Problem Revision Tracker


| ID  | Title        | Difficulty | Language | Last Revised | Notes                      | Link |
|-----|-------------|-----------|----------|-------------|---------------------------|------------------------------------------------------|
| 62  | Unique Paths | Medium    | Java     | 29/12/2025  | Used DP on grids approach|[View](https://leetcode.com/problems/unique-paths/description/) |
|  64 |  Minimum Path Sum |   Medium  |   Java | 29/12/2025 | Tip : Out of bound case, base/end case, and think about what u will store in dp[n-1][m-1]  | [View](https://leetcode.com/problems/minimum-path-sum/description/)|
| 931  |  Minimum Falling Path Sum | Medium    | Java     | 1/1/2026  | Try each element of 1st row as start of recursion and takes minimum of all the resulting ans, check column out of bound case for matrix. Base case is row==n-1|[View](https://leetcode.com/problems/minimum-falling-path-sum/description/) |
| GFG  | Subset Sum Problem | Medium    | Java     | 2/1/2026  | take not-take approach|[View](https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1) |
| 416  | Partition Equal Subset Sum | Medium    | Java     | 2/1/2026  | Almost same as subset sum but here think about total sum and how to find out target sum from it. |[View](https://leetcode.com/problems/partition-equal-subset-sum/description/) |
| 322  | Coin Change | Medium    | Java     | 5/1/2025  | Tip : As you have to take minimum, if ur case is invalid, u need to return max value. Else comparision will not work if u take 0 or -1. Tip 2: Think about what happens when u add 1 + Integer.MAX_VALUE. It gives Integer overflow. use (int) 1e9 instead. |[View](https://leetcode.com/problems/coin-change/description/) |
| 518  | Coin Change 2 | Medium    | Java     | 6/1/2025  | Almost same but here think what u want to store in dp and what should be returned in final answer |[View](https://leetcode.com/problems/coin-change-ii/description/) |
| 1143  | Longest Common Subsequence | Medium    | Java     | 7/1/2026 | Match, not match. Base Case : Out of bounds|[View](https://leetcode.com/problems/longest-common-subsequence/description/) |
| 516  | Longest Palindromic Subsequence | Medium    | Java     | 8/1/2026 | 2 methods : 1. Using LCS or 2. Two pointers + dp |[View](https://leetcode.com/problems/longest-palindromic-subsequence/description/) |
| 141  | Linked List Cycle | Easy    | Java     | 11/1/2026  | Slow and Fast ptr concrpt |[View](https://leetcode.com/problems/unique-paths/description/) |
| 5  | Longest Palindromic Substring | Medium    | Java     | 16/1/2026  | Tip : Every single char in string is palindrom. So dp[i][i] shall alwyas be True. now, if u iterate from j=0 to i, and check if str[j] and str[i] match and str[j+1][i-1] = true then its also a palindrome. Think about edge cases here. |[View](https://leetcode.com/problems/longest-palindromic-substring/description/) |
| 70  | Climbing Stairs | Easy    | Java     | 14/1/2026  | Every step depends on its previous n-1 and n-2 th steps|[View](https://leetcode.com/problems/climbing-stairs/description/) |
