// Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

// Example 1:

// Input:
// N = 5
// arr[] = {10, 20, 30, 40, 50}
// Output: 1
// Explanation: The given array is sorted.
// Example 2:

// Input:
// N = 6
// arr[] = {90, 80, 100, 70, 40, 30}
// Output: 0
// Explanation: The given array is not sorted.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function arraySortedOrNot() which takes the arr[] and N as input parameters and returns a boolean value (true if it is sorted otherwise false).

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50,9};
        int n = arr.length;

        System.out.println(checkSorted(arr,n));
    }

    static boolean checkSorted(int arr[],int n){
        boolean isSorted = true;

        for(int i = 0;i<n-1;i++){
            // if(i+1<n-1 && arr[i]>arr[i+1]){
            if(arr[i]>arr[i+1]){
                isSorted = false; 
            }
        }
        if(isSorted == true){
            return true;
        }else{
            return false;
        }

    }
}
