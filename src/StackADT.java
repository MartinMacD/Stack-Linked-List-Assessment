/**
 * Martin MacDonald
 * 18/04/2024
 *
 * This interface includes methods to be implemented for creating a Stack class
 */
public interface StackADT {

    /**
     * Push adds a value to the top of the stack
     * @param value is the value needed to be pushed to top of stack
     */
    void push (int value);

    /**
     * Pop removes a value from the top of the stack and returns that value
     * @return an int
     */
    int pop() throws Exception;

    /**
     * isEmpty checks if the stack is empty
     * @return a boolean true if empty and false if not empty
     */
    boolean isEmpty();

    /**
     * size returns the number of items on the stack
     * @return an int variable equal to number of items on the stack
     */
    int size();

}
