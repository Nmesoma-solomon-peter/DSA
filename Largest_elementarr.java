public class Largest_elementarr {
    
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,90,9000};
        int n = arr.length;
        System.out.println(compute(arr,n));
    }
    static int compute(int arr[], int N){
        int Largest = arr[0];
        for(int i = 1; i<N; i++){
            if(arr[i]> Largest){
                Largest = arr[i];
            }
        }

        return Largest;
        //time complexity = O(n) => linear time.
        
    }
}
