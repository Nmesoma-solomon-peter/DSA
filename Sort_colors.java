// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 
public class Sort_colors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        sort(nums);
    }

    static void sort(int nums[]){
        int size  = nums.length;
        int start = 0;
        int end = size-1;
        int current =0;
        while(current <= end)
            if(nums[current] == 2){
                int temp = nums[current];
                nums[current] = nums[end];
                nums[end] = temp;
                end--;
            }else if(nums[current]== 0){
                int temp = nums[current];
                nums[current] = nums[start];
                nums[start] = temp;
                start ++; 
                current ++;
            }else{
                current++;
        }

        for(int num:nums){
            System.out.println(num);
        }

    }
}
