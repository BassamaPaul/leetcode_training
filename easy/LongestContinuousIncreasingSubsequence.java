/**
Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 

Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
Note: Length of the array will not exceed 10,000.
*/

public int findLengthOfLCIS(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }

    int maxLength = 0, k = 0, i = 1, prev = nums[0], n = nums.length;

    for (;i < n; i++) {
        if (nums[i] <= prev) {
            maxLength = Math.max(maxLength, i - k);
            k = i;
        }
        prev = nums[i];
    }

    return Math.max(maxLength, i - k);
}
