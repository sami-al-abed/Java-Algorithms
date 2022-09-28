import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class used to apply binary search algorithm to find items in a sorted list
 */
public class BinarySearchWithLists
{
    /**
     * Method used to apply merge sort
     * @param list sorted list with element to find
     * @param target element of list we are trying to find
     * @return index of where the target is in the list
     */
    public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (list.get(mid) == target) return mid;
            else if (list.get(mid) > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    /**
     * Main function used to test sort
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(2, 8, 89, 120, 1000));
        System.out.println(binarySearch(list, 120));
    }
}
