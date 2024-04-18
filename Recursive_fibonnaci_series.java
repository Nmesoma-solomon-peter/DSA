public class Recursive_fibonnaci_series {
    public static void main(String[] args) {
        int n = 5;
        for(int i =0;i<n;i++){
            System.out.println(fib(i));
        }
        // create an array of two elements

        // pass the array to a fib function.
    }

    public static long fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    //
}
