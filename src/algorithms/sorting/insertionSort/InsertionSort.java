package src.algorithms.sorting.insertionSort;

/** Here, we are implementing InsertionSort where we sort the array in increasing (or more precisely, non-decreasing)
 * order.
 *
 * Brief Description:
 * InsertionSort is a simple comparison-based sorting algorithm that builds the final sorted array one element at a
 * time. It works by repeatedly taking an element from the unsorted portion of the array and inserting it into its
 * correct position within the sorted portion. At the kth iteration, we take the element arr[k] and insert
 * it into arr[0, k-1] following sorted order, returning us arr[0, k] in sorted order.
 *
 * Implementation Invariant:
 * The loop invariant is: at the end of kth iteration, the first (k+1) items in the array are in sorted order.
 * At the end of the (n-1)th iteration, all n items in the array will be in sorted order.
 * (Note: the loop invariant here slightly differs from the lecture slides as we are using 0-based indexing.)
 *
 * Complexity Analysis:
 * Time:
 * - Worst case (reverse sorted array): O(n^2)
 * - Average case: O(n^2)
 * - Best case (sorted array): O(n)
 *
 * In the worst case, inserting an element into the sorted array of length m requires us to iterate through the
 * entire array, requiring O(m) time. Since InsertionSort does this insertion (n - 1) times, the time complexity
 * of InsertionSort in the worst case is 1 + 2 + ... + (n-2) + (n-1) = O(n^2).
 *
 * In the best case of an already sorted array, inserting an element into the sorted array of length m requires
 * O(1) time as we insert it directly behind the first position of the pointer in the sorted array. Since InsertionSort
 * does this insertion (n-1) times, the time complexity of InsertionSort in the best case is O(1) * (n-1) = O(n).
 *
 * Space:
 * - O(1) since sorting is done in-place
 */

public class InsertionSort {
    /**
     * Sorts the given array in-place in non-decreasing order.
     * @param arr array to be sorted.
     * @return the same array arr that is sorted.
     */
    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { //loop which supports the invariant
            arr = insert(arr, i, arr[i]);
        }
        return arr;
    }

    /** Inserts val within the sorted portion of the array. The sorted portion of the array is arr[0, idx - 1].
     *
     * @param arr the array to be sorted (of length idx)
     * @param idx index of the element to be inserted into the sorted portion of the array
     * @param val value of the element to be inserted into the sorted portion of the array
     * @return returns arr with arr[0, idx] in sorted order
     */
    private static int[] insert(int[] arr, int idx, int val) {
        int pointer = idx - 1;

        while (pointer >= 0 && arr[pointer] > val) { //if we change this to arr[pointer] < val,
            // we can sort the array in non-increasing order
            arr[pointer + 1] = arr[pointer];
            pointer -= 1;
        }
        arr[pointer + 1] = val;

        return arr;
    }
}