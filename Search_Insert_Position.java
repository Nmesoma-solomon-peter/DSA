// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

public class Search_Insert_Position {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int n = arr.length;
        int target = 0;

        System.out.print(findPosition(arr,n,target));
    }

    static int findPosition(int arr [],int n,int target){
        int start =0;
        int end = n-1;

        // for(int i =0;i<n;i++){
            
            while (start<=end) {
                int mid = start +(end-start)/2;
                if(target == arr[mid]){
                    return mid;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
                
            }
        // }
        return start;

    }
    
    
}
