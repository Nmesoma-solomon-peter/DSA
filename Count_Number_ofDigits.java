import java.util.Scanner;

/**
 * Count_Number_ofDigits
 */
public class Count_Number_ofDigits {
    public static int count(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to count");
        int num = sc.nextInt();
        System.out.println(count(num));


    }

    
}