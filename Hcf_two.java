/**
 * Hcf_two
 */
import java.util.Scanner;
public class Hcf_two {
    public static int hcf(int num1, int num2) {
        int lowernum = num1;
        if(num2 < num1){
            lowernum = num2;
        }
        for(int i = lowernum; i>=1; i--){
            if(num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static int hcf_euclid(int num1, int num2){
        while (num1!=num2) {
            if(num1 > num2){
                num1 = num1-num2;
            }else{
                num2 = num2-num1;
            }
        }
        return num1;
    }
    public static int hcf_lame(int num1, int num2){
        while(num1!=0 && num2!=0){
            if(num1 > num2){
                num1 = num1%num2;
            }else{
                num2 = num2%num1;
            }
        }
        if(num1 == 0){
            return num2;
        }
        else if(num2 == 0){
            return num1;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        // System.out.println(hcf(num1, num2));
        // System.out.println(hcf_euclid(num1, num2));
        System.out.println(hcf_lame(num1, num2));
    }
}