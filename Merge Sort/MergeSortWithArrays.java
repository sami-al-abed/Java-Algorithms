import java.util.Arrays;

/**
 * Class used to apply merge sort algorithm on arrays
 */
public class MergeSortWithArrays
{
    /**
     * Method used to apply merge sort
     * @param array is the array to be sorted
     * @return sorted array
     */
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array; // break out of recursion if array size = 1

        int midPoint = array.length / 2;
        // recursively get the left and right of the midpoint of the array sorted
        int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, midPoint));
        int[] rightArray = mergeSort(Arrays.copyOfRange(array, midPoint, array.length));
        int[] mergedArray = new int[array.length];
        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;

        // merge pre sorted left and right sides of the array
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if(leftArray[leftIndex] <= rightArray[rightIndex]) mergedArray[mergeIndex++] = leftArray[leftIndex++];
            else mergedArray[mergeIndex++] = rightArray[rightIndex++];
        }
        while (leftIndex < leftArray.length) mergedArray[mergeIndex++] = leftArray[leftIndex++];
        while (rightIndex < rightArray.length) mergedArray[mergeIndex++] = rightArray[rightIndex++];

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
