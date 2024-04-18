// a java program that uses recursion to print sum of n natural numbers
public class Recursive_Sum_naturalNum {
    public static void main(String[] args) {
        int number = 10;
        int result = sum(number);
        System.out.println(result);
    }
    static int sum(int n){
        int res = 0;
        if(n==0){
            return n;
        }
        res = n + sum(n-1);
        return res;
    }
}
