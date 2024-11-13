/**
 * Martin MacDonald
 * 08/05/24
 */
public class MyLinkedStack implements StackADT{

    private IntLinkedList list;

    MyLinkedStack(){
        list = new IntLinkedList();
    }
    /**
     * Push adds a value to the top of the stack
     * @param value is the value needed to be pushed to top of stack
     */
    public void push (int value){
        list.addLast(value);
    }

    /**
     * Pop removes a value from the top of the stack and returns that value
     * @return an int
     */
    public int pop() throws Exception {
        return list.removeFirst();
    }

    /**
     * isEmpty checks if the stack is empty
     * @return a boolean true if empty and false if not empty
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }

    /**
     * size returns the number of items on the stack
     * @return an int variable equal to number of items on the stack
     */
    public int size(){
        return list.size();
    }

    public void display(){
        list.display();
    }
}
