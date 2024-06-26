// The task is to complete the insert() function which is used to implement Insertion Sort.
// Example 1:
// Input:
// N = 5
// arr[] = { 4, 1, 3, 9, 7}
// Output:
// 1 3 4 7 9
// Example 2:

// Input:
// N = 10
// arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Output:
// 1 2 3 4 5 6 7 8 9 10

// Your Task: 
// You don't have to read input or print anything. Your task is to complete the function insert() and insertionSort() where insert() takes the array, it's size and an index i and insertionSort() uses insert function to sort the array in ascending order using insertion sort algorithm. 

// Expected Time Complexity: O(N*N).
// Expected Auxiliary Space: O(1).

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7 };
        int size = arr.length;
        insert(arr, size);
    }

    static void insert(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        for(int ar:arr){
            System.out.println(ar);
        }
    }
}
