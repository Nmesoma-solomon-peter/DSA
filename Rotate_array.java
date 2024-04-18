// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
 

public class Rotate_array {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7};
        int k = 2;

        rotate(nums, k);
    }
    
    static void rotate(int nums [], int k){
        int size = nums.length;
        while(k>0){
            for(int i = size-1;i>0;i--){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
            k--;
        }
        for(int num:nums){
            System.out.println(num); 
        }
    }
    // time complexity = O(k*i);
    // space complexity = O(1);
}
