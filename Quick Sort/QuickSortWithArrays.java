/**
 * Class used to apply quick sort algorithm on arrays
 */
public class QuickSortWithArrays
{
    /**
     * Method used to apply quick sort
     * @param array is the array to be sorted
     * @param left start of the sublist to be sorted
     * @param right end of the sublist to be sorted
     */
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) return;

        int pivot = (left + right) / 2;

        swap(array, pivot, right);

        int leftPtr = left, rightPtr = right;
        while (leftPtr < rightPtr) {
            while (array[leftPtr] < array[right] && leftPtr < rightPtr) leftPtr++;
            while (array[rightPtr] >= array[right] && leftPtr < rightPtr) rightPtr--;
            if (leftPtr == rightPtr) break;
            swap(array, leftPtr, rightPtr);
        }

        swap(array, leftPtr, right);

        quickSort(array, left, leftPtr - 1);
        quickSort(array, leftPtr + 1, right);
    }

    /**
     * Method used to swap two elements in an array
     * @param array is the array with elements to swap
     * @param i is the first index to be swapped
     * @param j is the second index to be swapped
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Main function used to test sort
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        int[] array = {95, 13, 47, 52, 41, 68, 42};
        quickSort(array, 0, array.length - 1);
        for (int j : array) System.out.println(j);
    }
}
