/**
 * Class used to apply insertion sort algorithm
 */
public class InsertionSort
{
    /**
     * Method used to apply insertion sort
     * @param array is the array to be sorted
     */
    public static void insertionSort(int[] array) {
        // Loop through each element in the array assuming everything to the left is sorted
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int currentValue = array[i];
            // Add the current index to its proper position on the left and then move to the next number
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }

    /**
     * Main function used to test sort
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        int[] array = {27, 34, 30, 12, 82, 40, 55, 4};
        insertionSort(array);
        for (int j : array) System.out.println(j);
    }
}