
/**
 * a program that counts the number of TrailingZeros in a number
 */
import java.util.Scanner;

public class TrailingZero {
    public static int trailing(int num) {

        int power = 5;
        int result = 0;

        while (power <= num) {
            result += num / power;
            power = power * 5;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to calculate");
        int input = sc.nextInt();
        System.out.println(trailing(input));
    }
}
