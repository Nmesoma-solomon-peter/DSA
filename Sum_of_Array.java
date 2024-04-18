// Given an integer array arr[] of size n. The task is to find sum of it.

// Example 1:

// Input:
// n = 4
// arr[] = {1, 2, 3, 4}
// Output: 10
// Explanation: 1 + 2 + 3 + 4 = 10.
// Example 2:

// Input:
// n = 3
// arr[] = {1, 3, 3}
// Output: 7
// Explanation: 1 + 3 + 3 = 7.
// Your Task:
// Complete the function sum() which takes array arr and single integer n, as input parameters and returns an integer denoting the answer. You don't have to print answer or take inputs.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

public class Sum_of_Array {
   
    public static void main(String[] args) {
        int arr [] = {20,30,90};
        int n = arr.length;
        System.out.println(sum(arr,n) );
    }

    static int sum(int arr[], int n) {
        int sum = arr[0];
        for(int i = 1; i<n; i++){
            sum += arr[i];
        }
        return sum;
        //time complexity = O(n)
        // space complexity  = O(1)
    }
    
}
