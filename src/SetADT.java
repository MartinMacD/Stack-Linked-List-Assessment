/**
 * Martin MacDonald
 * 18/04/2024
 *
 * This interface includes methods to be implemented for creating a set class
 */
public interface SetADT {
    /**
     *Adds an object to the set
     * @param o is the object to be added to the set
     */
    void add(Object o);

    /**
     *Removes an object from the set
     * @param o is the object to be removed from the set
     */
    void remove(Object o);

    /**
     *Sets this set to the intersection of itself and variable s
     * @param s
     */
    void intersection(SetADT s);

    /**
     *Sets this set to the difference between itself and s
     * @param s
     */
    void difference(SetADT s);

    /**
     *Returns the number of objects in the set
     * @return
     */
    int size();

    /**
     *Returns true if the size is equal to 0, else returns false
     * @return
     */
    boolean isEmpty();
}
