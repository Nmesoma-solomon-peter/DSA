// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

 

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
 

// Constraints:

// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

// Follow up:

// How can we prove that at least one duplicate number must exist in nums?
// Can you solve the problem in linear runtime complexity?

import java.util.Arrays;

public class Find_Duplicate_number {
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }
    
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        for(int i = 0; i<size-1;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1 ;
        //Time complexity = O(n);
        //space complexity = O(1);
    }
}
