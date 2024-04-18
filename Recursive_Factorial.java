// find factorial of a given number using recursion
public class Recursive_Factorial {
    public static void main(String[] args) {
        int num = 5;
        int res = fact(num);
        System.out.println(res);
    }

static int fact(int number){
    int res=0;
    if(number == 1){
        return 1;
    }
    res = number *fact(number-1);
    return res;
    
}
}