
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.println("1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide");
        System.out.println("Choose operator");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();

        System.out.print("Enter first Number");
        n1 = sc.nextInt();

        System.out.print("Enter Second Number");
        n2 = sc.nextInt();

        int result = 0;

        switch (operator) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;

            default:
                System.out.println("Invalid operator");

        }

        System.out.println("Result: " + result);

    }
}
