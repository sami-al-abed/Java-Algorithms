import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class used to apply merge sort algorithm on lists
 */
public class MergeSortWithLists
{
    /**
     * Method used to apply merge sort
     * @param list is the list to be sorted
     */
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if (list.size() == 1) return list; // break out of recursion if array size = 1

        int midPoint = list.size() / 2;
        // recursively get the left and right of the midpoint of the array sorted
        ArrayList<Integer> leftList = mergeSort(new ArrayList<>(list.subList(0, midPoint)));
        ArrayList<Integer> rightList = mergeSort(new ArrayList<>(list.subList(midPoint, list.size())));
        ArrayList<Integer> mergedList = new ArrayList<>();
        int rightIndex = 0, leftIndex = 0;

        // merge pre sorted left and right sides of the array
        while (rightIndex < rightList.size() && leftIndex < leftList.size()) {
            if (rightList.get(rightIndex) < leftList.get(leftIndex)) mergedList.add(rightList.get(rightIndex++));
            else mergedList.add(leftList.get(leftIndex++));
        }

        while (rightIndex < rightList.size()) mergedList.add(rightList.get(rightIndex++));
        while (leftIndex < leftList.size()) mergedList.add(leftList.get(leftIndex++));

        return mergedList; // return merged array
    }

    /**
     * Main function used to test sort
     * @param args array of sequence characters that are passed to the main function on execution
     */
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(27, 3, 30, 12, 82, 40, 55, 4));
        ArrayList<Integer> sortedList = mergeSort(list);
        for (int j : sortedList) System.out.println(j);
    }

}
