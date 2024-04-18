//sum of array using recursion
public class Recursive_Sum_of_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int size = arr.length-1;
        int result = arraySum(arr,size);
        System.out.println(result);
        
    }
    static int arraySum(int [] arr,int length){

        int res =0;
        if(length==0){
            return arr[0];
        }
        res = arr[length] + arraySum(arr, length-1);
        return res;
    }
}
