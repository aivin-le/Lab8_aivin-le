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
        
        if(stack1.isEmpty()) score++;
        stack1.push("Hello");
        stack1.push("World!");
        if(stack1.search("Hello") == 2) score ++;
        if(stack1.search("World!") == 1) score ++;
        if(stack1.search("!") == -1) score ++;
        if(stack1.peek().equals("World!")) score++;
        if(stack1.pop().equals("World!")) score++;
        if(stack1.search("Hello") == 1) score ++;
        if(stack1.peek().equals("Hello")) score++;
        if(stack1.pop().equals("Hello")) score++;
        if(stack1.isEmpty()) score++;
        
        maxScore += 10;
        
        System.out.println("Earned " + score + " out of " + maxScore + " points.");
    }
}