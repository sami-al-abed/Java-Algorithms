/**
 * Class used to apply selection sort algorithm
 */
public class SelectionSort
{
    /**
     * Method used to apply selection sort
     * @param array is the array to be sorted
     */
    public static void selectionSort(int[] array) {
        // start at the front of the list and loop through it
        for(int i = 0; i < array.length; i++) {
            // swap all elements smaller than the current index with the current index
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) 
                    swap(array, i, j);
            }
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
        int[] array = {27, 34, 30, 12, 82, 40, 55, 4};
        selectionSort(array);
        for (int j : array) System.out.println(j);
    }
}