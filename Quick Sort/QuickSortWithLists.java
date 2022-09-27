import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class used to apply quick sort algorithm on lists
 */
public class QuickSortWithLists
{
    /**
     * Method used to apply quick sort
     * @param list is the list to be sorted
     * @param left start of the sublist to be sorted
     * @param right end of the sublist to be sorted
     */
    public static void quickSort(ArrayList<Integer> list, int left, int right) {
        if (left >= right) return;

        int pivot = (left + right) / 2;

        swap(list, pivot, right);

        int leftPtr = left, rightPtr = right;
        while (leftPtr < rightPtr) {
            while (list.get(leftPtr) < list.get(right) && leftPtr < rightPtr) leftPtr++;
            while (list.get(rightPtr) >= list.get(right) && leftPtr < rightPtr) rightPtr--;
            if (leftPtr == rightPtr) break;
            swap(list, leftPtr, rightPtr);
        }

        swap(list, leftPtr, right);

        quickSort(list, left, leftPtr - 1);
        quickSort(list, leftPtr + 1, right);
    }

    /**
     * Method used to swap two elements in a list
     * @param list is the list with elements to swap
     * @param i is the first index to be swapped
     * @param j is the second index to be swapped
     */
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    /**
     * Main function used to test sort
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(95, 13, 47, 52, 41, 68, 42));
        quickSort(list, 0, list.size() - 1);
        for (int j : list) System.out.println(j);
    }
}

