/**
 * Martin MacDonald
 * 25/04/2024
 */
public class MyStack implements StackADT{
    private IntArrayList intArrayList;

    public MyStack(){
        intArrayList = new IntArrayList(20);
    }

    /**
     * Push adds a value to the top of the stack
     * @param value is the value needed to be pushed to top of stack
     */
    public void push (int value){
        intArrayList.add(value);
    }

    /**
     * Pop removes a value from the top of the stack and returns that value
     * @return an int
     */
    public int pop(){
        return intArrayList.delete();
    }

    /**
     * isEmpty checks if the stack is empty
     * @return a boolean true if empty and false if not empty
     */
    public boolean isEmpty(){
        return intArrayList.isEmpty();
    }

    /**
     * size returns the number of items on the stack
     * @return an int variable equal to number of items on the stack
     */
    public int size(){
        return intArrayList.getCount();
    }

    /**
     * isFull checks if the stack is full
     * @return a boolean true if full and false if not full
     */
    public boolean isFull(){
        return intArrayList.isFull();
    }

    /**
     * display each item in intArrayList's into the console on separate lines for each item.
     */
    public void display(){
        for(int arrayItem: intArrayList.getArray()){
            System.out.println(arrayItem);
        }
    }
}
