// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// Given an integer array and another integer element. The task is to find if the given element is present in array or not.

// Example 1:

// Input:
// n = 4
// arr[] = {1,2,3,4}
// x = 3
// Output: 2
// Explanation: There is one test case 
// with array as {1, 2, 3 4} and element 
// to be searched as 3.  Since 3 is 
// present at index 2, output is 2.

/**
 * Search_element
 */
public class Search_element {
    static int search(int arr[], int N, int X){
        // using binary search
        int start = 0;
        int end = N-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid] == X){
                return mid;
            }else if(arr[mid] > X){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int x = 4;

        System.out.println(search(arr, n,x));
    }
    

}
  
  
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
  