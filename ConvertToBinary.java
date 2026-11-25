import java.util.Scanner;

/**
 * Implements the division method using a stack.
 *
 * @author Aivin Le
 * @version Created on November 25th, 2026.
 */
public class ConvertToBinary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer from 0 to " + Integer.MAX_VALUE + " or done to end:   ");
        
        String input, output;
        int inValue;
        input = sc.nextLine();
        while(!input.equals("done")) {
            inValue = Integer.valueOf(input);
            Stack stack = new Stack();
            while(inValue > 0) {
                stack.push(inValue % 2);
                inValue /= 2;
            }
            StringBuffer sb = new StringBuffer();
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            output = sb.toString();
            System.out.println("The equivalent binary number is: " + output);
            System.out.print("Press enter to continue.");
            sc.nextLine();
            System.out.print("Enter an integer from 0 to " + Integer.MAX_VALUE + " or done to end:   ");
            input = sc.nextLine();
        }
    }
}