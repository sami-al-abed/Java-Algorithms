public class InsertionSort
{
    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int currentValue = array[i];
            
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }
    
    public static void main(String[] args) {
        int array[] = {27, 34, 30, 12, 82, 40, 55, 4};
        
        insertionSort(array);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}