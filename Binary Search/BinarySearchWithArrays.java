/**
 * Class used to apply binary search algorithm to find items in a sorted list
 */
public class BinarySearchWithArrays
{
    /**
     * Method used to apply merge sort
     * @param array sorted array with element to find
     * @param target element of array we are trying to find
     * @return index of where the target is in the array
     */
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == target) return mid;
            else if (array[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    /**
     * Main function used to test sort
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        int[] array = {2, 8, 89, 120, 1000};
        System.out.println(binarySearch(array, 120));
    }
}
