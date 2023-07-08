package src.dataStructures.hashSet;

import java.util.*;

/**
 * Simple implementation of HashSet data structure. Uses a HashMap as its underlying implementation.
 * @param <T> The type of objects to be stored in the HashSet.
 */
public class HashSet<T> {
    private final Map<T, Boolean> hashSet = new HashMap<>();

    public HashSet() {}

    /**
     * Returns the number of elements in this set (its cardinality).
     *
     * @return the number of elements in this set (its cardinality)
     */
    public int size() {
        return this.hashSet.size();
    }

    /**
     * Returns true if this set contains no elements.
     *
     * @return true if this set contains no elements
     */
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /**
     * Returns true if this set contains the specified element.
     *
     * @param element the element whose presence in this set is to be tested
     * @return true if this set contains the specified element
     */
    public boolean contains(T element) {
        return this.hashSet.get(element);
    }

    /**
     * Adds the specified element to this set if it is not already present
     * More formally, adds the specified element e to this set if
     * the set contains no element e2 such that Objects.equals(e, e2).
     * If this set already contains the element, the call leaves the set
     * unchanged and returns false.
     *
     * @param element the element to be added to this set
     * @return true if this set did not already contain the specified
     * element
     */
    public boolean add(T element) {
        if (this.hashSet.get(element)) {
            return false;
        }
        this.hashSet.put(element, true);
        return true;
    }

    /**
     * Removes the specified element from this set if it is present.
     * More formally, removes an element e such that Objects.equals(o, e),
     * if this set contains such an element.  Returns true if this set
     * contained the element (or equivalently, if this set changed as a
     * result of the call).  (This set will not contain the element once the
     * call returns.)
     *
     * @param element the element to be removed from this set, if present
     * @return true if this set contained the specified element
     */
    public boolean remove(T element) {
        if (!this.hashSet.get(element)) {
            return false; // no element removed.
        }
        this.hashSet.remove(element);
        return true;
    }
}
