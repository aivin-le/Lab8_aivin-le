import java.util.Scanner;

/**
 * Evaluates PostFix expressions.
 *
 * @author Aivin Le
 * @version Created November 25th, 2026.
 */
public class PostFixCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a postfix expression or DONE to end:  ");
        String line = sc.nextLine();
        String[] input = line.split(" ");
        Stack stack = new Stack();
        double output, a, b;
        int index, i;
        
        while(!line.equals("done")) {
            i = 0;
            while(i < input.length) {
                if(Character.isDigit(input[i].charAt(0))) {
                    stack.push(Double.valueOf(input[i]));
                } else{
                    switch(input[i]) {
                        case "+":
                            a = (double) stack.pop();
                            b = (double) stack.pop();
                            stack.push(b + a);
                            break;
                        case "-":
                            a = (double) stack.pop();
                            b = (double) stack.pop();
                            stack.push(b - a);
                            break;
                        case "*":
                            a = (double) stack.pop();
                            b = (double) stack.pop();
                            stack.push(b * a);
                            break;
                        case "^":
                            a = (double) stack.pop();
                            b = (double) stack.pop();
                            stack.push(Math.pow(b,  a));
                            break;
                        case "%":
                            a = (double) stack.pop();
                            b = (double) stack.pop();
                            stack.push(b % a);
                            break;
                        default:
                            //Division
                            a = (double) stack.pop();
                            b = (double) stack.pop();
                            stack.push(b / a);
                    }
                }
                i++;
                System.out.println(stack);
            }
            
            output = (double) stack.pop();
            System.out.println("The expression " + line + " evaluates to " + output + ".");
            System.out.println("Press Enter to continue.");
            line = sc.nextLine();
            System.out.println("Enter a postfix expression or done to end:  ");
            line = sc.nextLine();
            input = line.split(" ");
            stack = new Stack();
            i++;
        }
        
    }
}