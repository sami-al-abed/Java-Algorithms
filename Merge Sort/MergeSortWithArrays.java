import java.util.Arrays;

/**
 * Class used to apply merge sort algorithm
 */
public class MergeSortWithArrays
{
    /**
     * Method used to apply merge sort
     * @param array is the array to be sorted
     */
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) return array; // break out of recursion if array size = 1

        int midpoint = array.length / 2;
        // recursively get the left and right of the midpoint of the array sorted
        int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, midpoint));
        int[] rightArray = mergeSort(Arrays.copyOfRange(array, midpoint, array.length));
        int[] mergedArray = new int[array.length];
        int leftPtr = 0, rightPtr = 0, mergePtr = 0;

        // merge pre sorted left and right sides of the array
        while (leftPtr < leftArray.length && rightPtr < rightArray.length) {
            if(leftArray[leftPtr] <= rightArray[rightPtr]) mergedArray[mergePtr++] = leftArray[leftPtr++];
            else mergedArray[mergePtr++] = rightArray[rightPtr++];
        }
        while (leftPtr < leftArray.length) mergedArray[mergePtr++] = leftArray[leftPtr++];
        while (rightPtr < rightArray.length) mergedArray[mergePtr++] = rightArray[rightPtr++];

        return mergedArray; // return merged array
    }

    /**
     * Main function used to test sort
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        int[] array = {27, 3, 30, 12, 82, 40, 55, 4};
        int[] sortedArray = mergeSort(array);
        for (int j : sortedArray) System.out.println(j);
    }
}
