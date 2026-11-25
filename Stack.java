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
    
    public E peek() {
        return null;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    public void clear() {
        
    }
}
