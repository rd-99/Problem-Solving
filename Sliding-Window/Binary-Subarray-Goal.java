//Given a binary array nums and an integer goal, 
//return the number of non-empty subarrays with a sum goal.

// nums = [1,0,1,0,1], goal = 2 => 4

// 1. Brute Force
// 2. Sliding Window
// 3. Prefix Sum

1. Brute Force

class Solution{

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    Solution - 
    // 1. Initialize count = 0
    // 2. Loop through the array
    // 3. Loop through the array from i to n
    // 4. If the sum of the subarray is equal to goal, increment count
    // 5. Return count
    }

2. Sliding Window

// Time Complexity: O(n)
// Space Complexity: O(1)
//Calcute sum of goal - sum of goal-1

code- 

    func SumOfGoal()-
    {
        int n = nums.length,count = 0,sum = 0,left = 0;
        for(int right = 0; right < n; right++)
        {
            sum += nums[right];
            while(sum > goal)
            {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
    return SumOfGoal(nums, goal) - SumOfGoal(nums, goal - 1);
    //Since we need to find the number of subarrays with sum goal, we can find the number of subarrays with sum goal - 1 and subtract it from the number of subarrays with sum goal.