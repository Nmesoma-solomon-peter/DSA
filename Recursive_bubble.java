public class Recursive_bubble {
    public static void main(String[] args) {
        // create an array
        int arr[] = { 8, 6, 9, 4, 6, 1, 3,500,100 };
        int start = 0;
        // call the recursive func
        for(int i = 0;i< arr.length;i++){
            recursivebubble(arr, start);
        }
        // define recursive function
        for(int ar:arr){
            System.out.println(ar);
        }
    }

    public static int recursivebubble(int []arr,int start){
        //create a variable size = arr.length
        int size = arr.length;
        //write base case, if  new int == size -1 return arr[newint]
        if(start == size-1){
        return arr[start];
    }
        //if arr[new arr] > arr [new arr+1] 
        // then swap  and call the func again and pass
        if(arr[start] > arr[start +1 ]){
        int temp = arr[start];
        arr[start] = arr[start+1];
        arr[start+1] = temp;
    }
        int sorted_arr=recursivebubble(arr,start+1);
        return sorted_arr;
    }
}
