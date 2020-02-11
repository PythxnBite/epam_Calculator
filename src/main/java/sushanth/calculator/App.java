package sushanth.calculator;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number - 1: ");
        double num1 = scan.nextInt();
        System.out.println("Enter Operator from the following choices: +, -, *, /");
        String op = scan.next();
        System.out.print("Enter Number - 2: ");
        double num2 = scan.nextInt();
        Operate operate = new Operate(num1, num2, op);
        String res = operate.resolve();

        if (res == null) {
            System.out.println("Please enter a valid operator");
        } else {
            System.out.println("The result is: " + res);
        }

        scan.close();

    }
}
