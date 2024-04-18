public class Recursive_findMax {

   public static void main(String[] args) {
    int arr[] = {2,3,4,10,70,9,8,7,90,1000};
    System.out.println("The maximum element here is : "+ findmax(arr));
   }

   public static int findmax(int[] arr){
    if(arr==null || arr.length == 0){
        throw new IllegalArgumentException("the array must not be empty");
    }
    return findmax(arr,0);
   }
    public static int findmax(int[] arr,int startIndex){
        if(startIndex == arr.length-1){
            return arr[startIndex];
        }
        int max = findmax(arr,startIndex+1);
        if(arr[startIndex]> max){
            max = arr[startIndex];
        }
        return max;
    }
}
