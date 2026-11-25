/**
 * Driver class to test Stack<E> class.
 *
 * @author Aivin Le
 * @version written November 25, 2026.
 */
public class StackDriver
{
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        int score = 0;
        int maxScore = 0;
        
        stack1.push("Hello");
        stack1.push("World!");
        if(stack1.pop().equals("World!")) score++;
        if(stack1.pop().equals("Hello")) score++;
        
        maxScore += 2;
        
        System.out.println("Earned " + score + " out of " + maxScore + " points.");
    }
}