/**
 * Implements a generic stack.  
 * 
 * @author Aivin Le
 * @version Written on November 25th, 2026
 */
public class Stack<E> implements StackInterface<E>
{
    private class Node<E>
    {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next)
        {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;

    public Stack()
    {
        head = null;
    }

    //add the required methods here
    /**
     * Adds an element to the top of the stack.
     * 
     * @param element the element to add to the top of the stack.
     */
    public void push(E element) {
        if(head == null) {
            head = new Node(element, null);
        } else {
            Node newNode = new Node(element, head);
            head = newNode;
        }
    }
    
    /**
     * Removes and returns an element from the top of the stack.
     * 
     * @return the element at the top of the stack. Returns null if the stack is empty.
     */
    public E pop() {
        Node popThis = head;
        head = head.next;
        return (E) popThis.value;
    }
    
    /**
     * Returns an element from the top of the stack without removing it.
     * 
     * @return the element at the top of the stack.
     */
    public E peek() {
        E top;
        if(head == null) {
            top = null;
        } else{
            top = head.value;
        }
        return top;
    }
    
    /**
     * Returns true if the stack is empty and false otherwise.
     * 
     * @return true if stack is empty and false otherwise.
     */
    public boolean isEmpty() {
        return (head == null);
    }
    
    /**
     * Empties the stack.
     */
    public void clear() {
        head = null;
    }
    
    /**
     * Searches for the posistion of the input parameter in the stack and returns -1 if the input is not in the stack. 
     * The element at the top of the stack is in posistion 1.
     * For a stack with n elements, the element at the bottom of the stack has posistion n.
     * 
     * @param obj the object to search the stack for.
     * @return an int representing the posistion of the object in the stack or -1 if the object cannot be found.
     */
    public int search(Object obj) {
        int index = -1;
        int i = 1;
        Node finger = head;
        while(!finger.value.equals(obj) && finger.next != null) {
            finger = finger.next;
            i++;
        }
        if(finger.value.equals(obj)) index = i;
        return index;
    }
    
    /**
     * Returns a String representation of the stack, separated by spaces.
     * No leading or trailing spaces in the returned string.
     * Return an empty string if the stack is empty.
     * 
     * @return the String representation of the stack.
     */
    public String toString() {
        StringBuffer output = new StringBuffer();
        if(head != null) {
            output.append(head.value);
            Node finger = head.next;
            while(finger != null) {
                output.append(" ");
                output.append(finger.value);
                finger = finger.next;
            }
        }
        return output.toString();
    }
}
