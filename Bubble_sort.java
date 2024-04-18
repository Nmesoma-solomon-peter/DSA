// Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
// Example 1:

// Input: 
// N = 5
// arr[] = {4, 1, 3, 9, 7}
// Output: 
// 1 3 4 7 9
// Example 2:

// Input:
// N = 10 
// arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Output: 
// 1 2 3 4 5 6 7 8 9 10

// Your Task: 
// You don't have to read input or print anything. Your task is to complete the function bubblesort() which takes the array and it's size as input and sorts the array using bubble sort algorithm.

// Expected Time Complexity: O(N^2).
// Expected Auxiliary Space: O(1).

public class Bubble_sort {
    // public static void main(String[] args) {
    //     // int arr[] = {4, 1, 3, 9, 7};
    //     int arr[] = {8,6,9,4,6,1,3};
    //     int size = arr.length;

    //     for(int i =0; i<size-1;i++){
    //         int j=i+1;
    //         while(j<size-i){
    //             if(arr[i]>arr[j]){
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //             j++;
    //         }
    //     }

    //     for(int ar:arr){
    //         System.out.println(ar);
    //     }
        
    // }
    public static void main(String[] args){
        int arr[] ={8,6,9,4,6,1,3};
        int n = arr.length;
        // call the function
        binarysort(arr, n);
        for(int arrp: arr){
            System.out.println(arrp);
        }
    
    } 
    
    // define the function
        public static int[] binarysort(int arr[], int n){
                //for outer i loop from 0 to n-1 
            for(int i =0;i<=n-1;i++){
                // another loop j that swaps the numbers to make sure that at the end we got one sorted part
                for(int j =0;j<n-i-1;j++){
                    // an if statement that compares the element at j with element at j+1 and swaps jth element with j+1th if the jth element is greater than jth element
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
                return arr;
    
        }
}
