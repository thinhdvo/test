/**
 * A class for executing binary searches in an array.
 */
public class BinarySearcher {
   /**
    * Finds a value in a range of a sorted array, using the binary search
    * algorithm.
    * 
    * @param a     the array in which to search
    * @param low   the low index of the range
    * @param high  the high index of the range
    * @param value the value to find
    * @return the index at which the value occurs, or -1 if it does not occur in
    *         the array
    */

   public static int search(int[] a, int low, int high, int value) {
      // your code in here

      int mid = low + (high - low) / 2;
      // is the value in the middle on the array
      if (a[mid] == value) {
         return mid;
      }

      if (a[mid] > value) {
         return search(a, low, mid - 1, value);
      } else { // a[mid] < value
         return search(a, mid + 1, high, value);
      }

      // end
   }

}
