// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.
// Example 2:

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned instead.
// Example 3:

// Input: nums = [2,2,3,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2 (both 2's are counted together since they have the same value).
// The third distinct maximum is 1.
 
public class Third_max {
    public static void main(String[] args) {
        int nums []= {2,2,3,1};
        int size = nums.length;
  
        System.out.println(Thirdmax(nums, size));      
    }

    static int Thirdmax(int nums[], int size){
        long max = Long.MIN_VALUE;
        long second_max =  Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;
        for(final int num:nums){
            if(num>max){
                third_max = second_max;
                second_max = max;
                max = num;
            }else if(num<max&& num>second_max){
                third_max = second_max;
                second_max = num;
            }else if (num < second_max && num> third_max){
                third_max = num;
            }
        }
        // if(third_max!= second_max){
        //     return third_max;
        // }else{
        //     return first_max;
        // }

        // if(third_max == Integer.MIN_VALUE){
        //     return (int)max;
        // }else{
        //     return (int)third_max;
        //}
        return third_max == Long.MIN_VALUE ? (int)max: (int) third_max;
    }
}
