package src.algorithms.sorting.selectionSort;

/** Here, we are implementing SelectionSort where we sort the array in increasing (or more precisely, non-decreasing)
 * order.
 *
 * Brief Description and Implementation Invariant:
 * SelectionSort works by finding the minimum element A[j] in A[i...n], then swapping A[i] with A[j], for i in
 * range (0, n-2). The loop invariant is: at the end of the kth iteration, the smallest k items are correctly sorted in
 * the first k positions of the array.
 *
 * At the end of the (n-1)th iteration of the loop, the smallest (n-1) items are correctly sorted in the first (n-1)
 * positions of the array, leaving the last item correctly positioned in the last index of the array. Therefore,
 * (n-1) iterations of the loop is sufficient.
 *
 * Complexity Analysis:
 * Time:
 * - Worst case: O(n^2)
 * - Average case: O(n^2)
 * - Best case: O(n^2)
 * Regardless of how sorted the input array is, selectionSort will run the minimum element finding algorithm (n-1)
 * times. Since finding the minimum element necessarily takes O(n) time, the time complexity of selectionSort is
 * upper-bounded by (n-1) * n ≈ n^2.
 *
 * Space:
 * - O(1) since sorting is done in-place
 */

public class SelectionSort {
}
