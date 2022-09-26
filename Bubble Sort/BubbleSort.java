/**
 * Class used to apply bubble sort algorithm
 */
public class BubbleSort
{
    /**
     * Method used to apply bubble sort
     * @param array is the array to be sorted
     */
    public static void bubbleSort(int[] array) {
        // Loop through the array, add the largest element to the end and shrink end of array until array is sorted
        // If there is one pass through the array that doesn't sort it, then array is sorted and it will return
        for (int i = array.length - 1; i > 0; i--) {
            boolean wasChanged = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    wasChanged = true;
                    swap(array, j, j + 1);
                }
            }
            if (!wasChanged) return;
        }
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
        int[] array = {27, 3, 30, 12, 82, 40, 55, 4};
        bubbleSort(array);
        for (int j : array) System.out.println(j);
    }
}