// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

import java.util.Arrays;

public class Majority_element {
    public static void main(String[] args) {
        int arr [] = {6,6,6,7,7};
        int size = arr.length;
        Arrays.sort(arr);

        int majority =1;
        int element = arr[0];
        for(int i =0;i<size-1;i++){
            if(arr[i] == arr[i+1]){
                element = arr[i];
                majority++;
            }
            if(majority > (size/2)){
                System.out.println(element);
                break;
            }
        }
        

    }
}
